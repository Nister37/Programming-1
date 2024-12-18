package A810;

public class TaxfreeProduct extends Product{
    public TaxfreeProduct(int id,String description, double price) {
        super(id,description,price,0);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
