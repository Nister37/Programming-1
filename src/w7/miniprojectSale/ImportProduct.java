package miniprojectSale;

public class ImportProduct extends Product{
    private double importTax;

    public ImportProduct(int id, String description, double price, int vat, double importTax) {
        super(id, description, price, vat);
        setImportTax(importTax);
    }

    public double getImportTax() {
        return importTax;
    }

    public void setImportTax(double importTax) {
        this.importTax = importTax;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
