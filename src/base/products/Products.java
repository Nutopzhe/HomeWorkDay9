package base.products;

import base.products.ProductGrade;

public class Products {
    private ProductGrade productGrade;
    private double weight;
    private double pricePerKg;

    public Products(ProductGrade productGrade, double weight, double pricePerKg) {
        this.productGrade = productGrade;
        this.weight = weight;
        this.pricePerKg = pricePerKg;
    }

    public ProductGrade getProductGrade() {
        return productGrade;
    }

    public void setProductGrade(ProductGrade productGrade) {
        this.productGrade = productGrade;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productGrade=" + productGrade +
                ", weight=" + weight +
                ", pricePerKg=" + pricePerKg +
                '}';
    }
}
