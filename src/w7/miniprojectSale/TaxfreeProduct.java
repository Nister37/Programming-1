package miniprojectSale;

public class TaxfreeProduct extends Product{
    public TaxfreeProduct(int id, String description, double price){
        super(id, description, price, 0);
    }
}
