package A810;

public class Product {
    private int vatPercentage;
    private int id;
    private String description;
    private double price;

    public Product(int id, String description, double price, int vatPercentage) {
        this.vatPercentage = vatPercentage;
        this.id = id;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "vatPercentage=" + vatPercentage +
                ", id=" + id +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
