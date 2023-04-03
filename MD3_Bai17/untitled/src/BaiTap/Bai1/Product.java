package BaiTap.Bai1;

import java.io.Serializable;

public class Product implements Serializable {
    private int productId;
    private String productName;
    private String brand;
    private long price;
    private String memo;

    public Product() {
    }

    public Product(int productId, String productName, String brand, long price, String memo) {
        this.productId = productId;
        this.productName = productName;
        this.brand = brand;
        this.price = price;
        this.memo = memo;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", memo='" + memo + '\'' +
                '}';
    }
}
