package Ex06.ex06salesperson;

public class SalesPerson {
    private String name;
    private double revenue;

    public SalesPerson(String name, double revenue) {
        this.name = name;
        this.revenue = revenue;
    }

    public String getName() {
        return name;
    }
    public double getRevenue() {
        return revenue;
    }
    public boolean hasMoreRevenueThan(SalesPerson other) {
        if(other.revenue < this.revenue)
        {
            return true;
        }else{
            return false;
        }
    }
}
