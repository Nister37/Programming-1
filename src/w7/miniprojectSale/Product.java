package miniprojectSale;

public class Product {
    private int vatPercentage;
    private int id;
    private String description;
    private double price;

    public Product(int id, String description, double price, int vat) {
        setId(id);
        setDescription(description);
        setPrice(price);
        setVatPercentage(vat);
    }

    public int getVatPercentage() {
        return vatPercentage;
    }

    public void setVatPercentage(int vatPercentage) {
        this.vatPercentage = vatPercentage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
