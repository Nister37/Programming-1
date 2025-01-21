package miniprojectSale;

import java.sql.SQLOutput;

public class SalesLine {
    Product product;
    private int quantity;

    public SalesLine(Product product, int quantity) {
        setProduct(product);
        setQuantity(quantity);
    }

    public void show(){
        System.out.printf("%-30s quantity: %d price: €%.2f VAT: €%.2f total: €%.2f\n",
                getProduct().getDescription(),
                getQuantity(),
                getQuantity() * getProduct().getPrice(),
                getQuantity() * ((getProduct().getVatPercentage() * 0.01) * getProduct().getPrice()),
                getQuantity() * ((getProduct().getVatPercentage() * 0.01) * getProduct().getPrice() + getProduct().getPrice()));
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("%dx %d %s €%.1f %d%%",getQuantity(), getProduct().getId(), getProduct().getDescription(), getProduct().getPrice(), getProduct().getVatPercentage());
    }
}
