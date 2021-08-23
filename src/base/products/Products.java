package base.products;

public class Products {
    private ProductGrade productGrade;
    private int weight;
    private int pricePerKg;

    public Products(ProductGrade productGrade, int weight, int pricePerKg) {
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(int pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    @Override
    public String toString() {
        return "{Наименование = " + productGrade +
                ", Вес=" + weight +
                ", Цена за кг=" + pricePerKg;
    }
}
