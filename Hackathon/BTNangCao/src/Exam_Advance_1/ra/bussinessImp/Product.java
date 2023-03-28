package Exam_Advance_1.ra.bussinessImp;

import Exam_Advance_1.ra.bussiness.IShop;
import static Exam_Advance_1.ra.run.ProductManagement.catalogList;

import java.util.ArrayList;
import java.util.Scanner;

public class Product implements IShop, Comparable<Product> {

    private int productId;
    private String productName;
    private String title;
    private String descriptions;
    private Catalog catalog;
    private float importPrice;
    private float exportPrice;
    private boolean productStatus;

    public Product() {
    }

    public Product(int productId, String productName, String title, String descriptions, float importPrice, boolean productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.title = title;
        this.descriptions = descriptions;
        this.catalog = catalog;
        this.importPrice = importPrice;
        this.exportPrice = importPrice * RATE;
        this.productStatus = productStatus;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return this.exportPrice = importPrice * RATE;
    }

//    public void setExportPrice(float exportPrice) {
//        this.exportPrice = exportPrice;
//    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ma san pham: ");
        productId = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap ten san pham: ");
        productName = scanner.nextLine();

        System.out.print("Nhap tieu de san pham: ");
        title = scanner.nextLine();

        System.out.print("Nhap mo ta san pham: ");
        descriptions = scanner.nextLine();

        System.out.print("Nhap gia nhap san pham: ");
        importPrice = Float.parseFloat(scanner.nextLine());

        // Tinh gia ban san pham
        exportPrice = importPrice * RATE;
        System.out.print("Nhap danh muc san pham: ");
        int catalogId = Integer.parseInt(scanner.nextLine());
        for (Catalog catalogs : catalogList
        ) {
            if (catalogs.getCatalogId() == catalogId) {
                this.catalog = catalogs;
                break;
            }
        }
    }

    @Override
    public void displayData() {
        System.out.println("Ma san pham:  %d\n" + productId);
        System.out.println("Ten san pham:  %s\n" + productName);
        System.out.println("Ten danh muc san pham: " + catalog.getCatalogName());
        System.out.println("Gia ban san pham : %.1f\n" + getExportPrice());
        System.out.println("Trang thái sản pham : %s\n" + (productStatus ? "Con Hang" : "Het Hang"));
    }

    @Override
    public int compareTo(Product o1, Product o2) {
        return (int) (o1.exportPrice - o2.exportPrice);
    }


    @Override
    public int compareTo(Product o) {
        return (int) (this.exportPrice - o.exportPrice);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", title='" + title + '\'' +
                ", descriptions='" + descriptions + '\'' +
                ", catalog=" + catalog +
                ", importPrice=" + importPrice +
                ", exportPrice=" + exportPrice +
                ", productStatus=" + productStatus +
                '}';
    }
}
