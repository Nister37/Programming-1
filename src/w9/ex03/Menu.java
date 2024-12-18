package ex03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Menu {
    private List<Drink> drinks;
    public Menu() {
        drinks = new ArrayList<>();
    }
    public void addDrink(Drink drink){
        this.drinks.add(drink);
    }

    public int getSize(){
        return this.drinks.size();
    }

    public double getTotalPrice(){
        double totalPrice = 0.0;
        for(Drink drink : this.drinks){
            totalPrice += drink.getPrice();
        }
        return totalPrice;
    }

    public Drink getMostExpensiveDrink(){
        double mostExpensivePrice = 0.0;
        int mostExpensiveIndex = 0;
        for(Drink drink : this.drinks){
            if(drink.getPrice() > mostExpensivePrice){
                mostExpensivePrice = drink.getPrice();
                mostExpensiveIndex = this.drinks.indexOf(drink);
            }
        }
        return this.drinks.get(mostExpensiveIndex);
    }

    public String getAlcoholicDrinks(){
        List<Drink> alcoholicDrinks = new ArrayList<Drink>();
        for(Drink drink : this.drinks){
            if(drink.isAlcoholic()){
                alcoholicDrinks.add(drink);
            }
        }
        return alcoholicDrinks.toString();
    }

    public void removeMoreExpensiveThen(){
        for(int i=0; i>=this.drinks.size(); i++) {
            if(this.drinks.get(i).getPrice() > 3.00){
                this.drinks.remove(i);
            }
        }
        System.out.println(this.drinks);
    }

    public void addDrinks(Drink[] drinks){
        for(Drink drink : drinks){
            this.drinks.add(drink);
        }
    }
    @Override
    public String toString() {
        String drinksString = "";
        for(Drink drink : this.drinks){
            drinksString += drink.toString() + "\n";
        }
        return drinksString;
    }

    public void sortDrinks(){
        Collections.sort(this.drinks);
    }

}
