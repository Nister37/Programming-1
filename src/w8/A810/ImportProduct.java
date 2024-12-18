package A810;

public class ImportProduct extends Product{
    private double importTax;

    public ImportProduct(int id, String description, double price, int vatPercentage, double importTax) {
        super(id, description, price, vatPercentage);
        this.importTax = importTax;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
