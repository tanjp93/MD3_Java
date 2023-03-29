package Bai1;

public class Products implements Comparable<Products>  {
    private int productId;
    private String product;


    private long ProductsCost;
    public Products() {
    }
    public Products(int productId, String product, long productsCost) {
        this.productId = productId;
        this.product = product;
        this.ProductsCost = productsCost;
    }

    public long getProductsCost() {
        return ProductsCost;
    }

    public void setProductsCost(long productsCost) {
        ProductsCost = productsCost;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productId=" + productId +
                ", product='" + product + '\'' +
                ", ProductsCost=" + ProductsCost +
                '}';
    }

    @Override
    public int compareTo(Products o) {
        return (int) (this.ProductsCost-o.getProductsCost());
    }
}
