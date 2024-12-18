import ex03.*;

public class Ex03and04 {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Drink[] drinks = new Drink[10];
        drinks[0] = new Drink("LaChoffue",3.5,false);
        drinks[1] = new Drink("Coca cola",2.0,false);
        drinks[2] = new Drink("Spa Sparkling",4.5,true);
        drinks[3] = new Drink("Spa Still",5.0,true);
        drinks[4] = new Drink("Coca cola light",2.0,false);
        drinks[5] = new Drink("Coffee",2.0,false);
        drinks[6] = new Drink("Tea",2.0,false);
        drinks[7] = new Drink("Pils",3.5,true);
        drinks[8] = new Drink("Duvel",3.5,true);
        drinks[9] = new Drink("Orval",4.0,true);

        menu.addDrinks(drinks);
        System.out.println(menu);
        menu.getSize();
        menu.getTotalPrice();
        menu.getMostExpensiveDrink();
        menu.getAlcoholicDrinks();
        menu.removeMoreExpensiveThen();
        menu.addDrink(new Drink("Pepsi", 3.0, false));
        menu.sortDrinks();
        System.out.println(menu);
    }
}
