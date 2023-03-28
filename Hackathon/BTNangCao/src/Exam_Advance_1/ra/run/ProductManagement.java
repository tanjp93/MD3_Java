package Exam_Advance_1.ra.run;

import Exam_Advance_1.ra.bussinessImp.Catalog;
import Exam_Advance_1.ra.bussinessImp.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    public static ArrayList<Catalog> catalogList = new ArrayList<>();
    public static ArrayList<Product> listProducts = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-2-MENU***************\n");
            System.out.println("1. Nhập số danh mục sản phẩm và nhập thông tin các danh mục");
            System.out.println("2. Nhập số sản phẩm và nhập thông tin các sản phẩm");
            System.out.println("3. Sắp xếp sản phẩm theo giá sản phẩm tăng dần (Comparable/Comparator) ");
            System.out.println("4. Tìm kiếm sản phẩm theo tên danh mục sản phẩm ");
            System.out.println("5. Thoát ");
            System.out.println("6. danh sach thu muc va san pham ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    createCatalog(catalogList, scanner);
                    break;
                case 2:
                    createProduct(listProducts, scanner);
                    break;
                case 3:
                    Collections.sort(listProducts);
                    for (Product product : listProducts
                    ) {
                        product.displayData();
                    }
                    break;
                case 4:
                    System.out.println("Nhập vào sản phẩm banj muốn tìm kiếm");
                    String inputProductName = scanner.nextLine();
                    List<Product> listSearch = new ArrayList<>();
                    for (Product searchPro : listProducts) {
                        if (searchPro.getProductName().contains(inputProductName)) {
                            listSearch.add(searchPro);
                        }
                    }
                    System.out.println("Danh sách tìm kiếm : ");
                    for (Product list : listSearch ) {
                        list.displayData();
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                case 6:
                    for (Catalog catalog : catalogList) {
                        System.out.print(catalog + " ");
                    }
                    System.out.println("--------------");
                    for (Product product : listProducts) {
                        System.out.print(product + " ");
                    }
                    break;
            }
        }
    }

    private static void createProduct(ArrayList<Product> listProducts, Scanner scanner) {
        System.out.println("Nhập số sản phẩm : ");
        int numberOfProduct = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfProduct; i++) {
            Product newProduct = new Product();
            newProduct.inputData();
            listProducts.add(newProduct);
        }
    }

    private static void createCatalog(ArrayList<Catalog> catalogList, Scanner scanner) {
        System.out.println("Nhap so danh muc : ");
        int numberOfCatalog = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfCatalog; i++) {
            Catalog catalog = new Catalog();
            catalog.inputData();
            catalogList.add(catalog);
        }
    }
}