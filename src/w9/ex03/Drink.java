package ex03;

public class Drink implements Comparable<Drink>{
    private String name;
    private double price;
    private boolean isAlcoholic;

    public Drink(String name, double price, boolean isAlcoholic) {
        setName(name);
        setPrice(price);
        setAlcoholic(isAlcoholic);
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAlcoholic() {
        return isAlcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        isAlcoholic = alcoholic;
    }

    @Override
    public String toString() {
        return String.format("%s €%.2f", name, price);
    }

    public int compareTo(Drink anotherDrink) {
        /*if(this.price < anotherDrink.price) return 1;
        if(this.price == anotherDrink.price) return 0;
        if(this.price > anotherDrink.price) return -1;
        return 0;*/

        if(this.isAlcoholic() && !anotherDrink.isAlcoholic()) return -1;
        if(this.isAlcoholic() && anotherDrink.isAlcoholic()) return 0;
        if(!this.isAlcoholic() && anotherDrink.isAlcoholic()) return 1;
        return 0;
    }

}
