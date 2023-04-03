package BaiTap.Bai1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String sourcePathFile = "src/BaiTap/Bai1/listProducts.txt";
        List<Product> listProducts=outputProduct(sourcePathFile);

        try{
        }catch (Exception e ){
            e.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("----------Product Management------------");
            System.out.println("1.Add Product");
            System.out.println("2.Show Product");
            System.out.println("3.Search Product");
            System.out.println("4.Edit Product");
            System.out.println("5.Exit");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:createProduct(listProducts, sc,sourcePathFile);
                    break;
                case 2:listProducts= outputProduct(sourcePathFile);
                    for (Product item:listProducts) {
                        System.out.println(item);
                    };
                    break;
                case 3:
                    listProducts= outputProduct(sourcePathFile);
                    searchProduct(listProducts,sc);
                    break;
                case 4:
                    editProduct(sc,sourcePathFile);
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
//        writeFile(sourcePathFile,listProducts);
    }

    public static void createProduct(List<Product> list, Scanner sc,String sourcePathFile) {
        int productId;
        System.out.println("Add Product's name:");
        String productName=sc.nextLine();
        System.out.println("Add Brand's name :");
        String brand=sc.nextLine();
        System.out.println("Input price :");
        long price=Long.parseLong(sc.nextLine());
        System.out.println("Memo :");
        String memo=sc.nextLine();
        if (list.isEmpty()){
            productId=1;
        }else {
            productId = list.get(list.size() - 1).getProductId() + 1; }
        Product newProduct=new Product(productId,productName,brand,price,memo);
        list.add(newProduct);
        writeFile(sourcePathFile,list);
        System.out.println("Product added successfully");
    }

    public static void writeFile(String path, List<Product> listProducts) {
        try {
            File file=new File(path);
            if (!file.exists()){
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listProducts);
            fos.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Product> outputProduct(String path){
        List<Product>list = null;
        try {
           File file=new File(path);
           if (!file.exists()){
               file.createNewFile();
           }
            FileInputStream fis=new FileInputStream(file);
            ObjectInputStream ois=new ObjectInputStream(fis);
            list=(List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public static boolean searchProduct(List<Product> list,Scanner sc){
        System.out.println("Input Product's name");
        String searchName=sc.nextLine();
        boolean check=false;
        for (Product item:list) {
            if (item.getProductName().contains(searchName)){
                System.out.println("Your product :");
                System.out.println(item);
                check= true;
                break;
            }
            else{
                System.out.println("Product your's search is not available! ");
                check = false;
            }
        };
        return check;
    }
    public static boolean editProduct(Scanner sc,String path){
        List<Product>list=outputProduct(path);
        System.out.println("Enter the product Id you want to edit : ");
        int id=Integer.parseInt(sc.nextLine());
        if (id<0||id>=list.size()){
            System.out.println("Item's not found ! ");
            return false;
        }
        System.out.println("Enter edit Product's name:");
        String productName=sc.nextLine();
        System.out.println("Enter edit Brand's name :");
        String brand=sc.nextLine();
        System.out.println("Enter edit price :");
        long price=Long.parseLong(sc.nextLine());
        System.out.println("Memo :");
        String memo=sc.nextLine();
        for (Product item:list) {
           if (item.getProductId()==id){
               item.setProductName(productName);
               item.setBrand(brand);
               item.setPrice(price);
               item.setMemo(memo);
           }
        }
        writeFile(path,list);
        return true;
    }
}
