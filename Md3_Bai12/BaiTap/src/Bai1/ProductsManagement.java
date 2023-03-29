package Bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductsManagement {
    public static void main(String[] args) {
        List<Products> listProducts = new ArrayList<>();
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1•\tThêm sản phẩm\n" +
                    "2•\tSửa thông tin sản phẩm theo id\n" +
                    "3•\tXoá sản phẩm theo id\n" +
                    "4•\tHiển thị danh sách sản phẩm\n" +
                    "5•\tTìm kiếm sản phẩm theo tên\n" +
                    "6•\tSắp xếp sản phẩm tăng dần, giảm dần theo giá\n" +
                    "7•\tThoát\n" +
                    "");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    listProducts=  createProduct(listProducts, sc);
                    break;
                case 2:
                    listProducts= updateProduct(listProducts, sc);
                    break;
                case 3:
                    listProducts= deleteProduct(listProducts, sc);
                    break;
                case 4:
                    showList(listProducts);
                    break;
                case 5:
                    searchProduct(listProducts, sc);
                    break;
                case 6:
                    Collections.sort(listProducts);
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        }
    }



    private static List<Products> createProduct(List<Products> listProducts, Scanner sc) {
        System.out.println("Nhap ten san pham ! ");
        String productName = sc.nextLine();
        System.out.println("Nhap gia san pham   : ");
        Long cost = Long.parseLong(sc.nextLine());
        int productId;
        if (listProducts.isEmpty()) {
            productId = 1;
        } else {
            productId = listProducts.get(listProducts.size() - 1).getProductId()+1;
        }
        Products newProduct = new Products(productId, productName,cost);
        listProducts.add(newProduct);
        return listProducts;
    }

    private static List<Products> updateProduct(List<Products> listProducts, Scanner sc) {
        List<Products> newList = new ArrayList<>();
        System.out.println("Nhap id san pham can sua  : ");
        int productId = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten san pham can sua  : ");
        String productName = sc.nextLine();
        System.out.println("Nhap gia san pham can sua  : ");
        Long cost = Long.parseLong(sc.nextLine());
        Products updatedProduct = new Products(productId, productName,cost);
        for (Products product : listProducts) {
            if (product.getProductId() != productId) {
                newList.add(product);
            } else newList.add(updatedProduct);
        }
        return newList;
    }

    private static List<Products> deleteProduct(List<Products> listProducts, Scanner sc) {
        List<Products> newList = new ArrayList<>();
        System.out.println("Nhap id san pham can xoa : ");
        int productId = Integer.parseInt(sc.nextLine());
        for (Products product : listProducts) {
            if (product.getProductId() != productId) {
                newList.add(product);
            }
            ;
        }
        return newList;
    }

    private static void showList(List<Products> listProducts) {
        for (Products product : listProducts) {
            System.out.println(product.toString());
        }
    }
    private static void searchProduct(List<Products> listProducts, Scanner sc) {
        System.out.println("Nhap ten san pham can tim kiem  : ");
        String productName = sc.nextLine();
        for (Products product : listProducts) {
            if (product.getProduct().contains(productName)){
                System.out.println("San Pham tim kiem la : "+product.toString());
            }
        }
    }
}
