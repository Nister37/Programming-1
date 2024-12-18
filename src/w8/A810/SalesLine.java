package A810;

public class SalesLine {
    private int quantity;
    private Product product;

    public SalesLine(Product product, int quantity) {
        this.quantity = quantity;
        this.product = product;
    }

    @Override
    public String toString() {
        return "SalesLine [quantity=" + quantity + ", product=" + product + "]";
    }

    public void show(){
        System.out.println("SalesLine");
    }
}
