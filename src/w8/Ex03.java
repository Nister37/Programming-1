import A803.*;

public class Ex03{
public static void main(String[] args) {
    Animals animals = new Animals();

    animals.add(new Eagle("eagle", 2, 50, 160));
    animals.add(new Ostrich("ostrich", 6));
    animals.add(new Swallow("swallow", 4, 120));
    animals.print();

    Named named = new Eagle("eagle 2", 1, 60, 150);
    Flying flying = new Eagle("eagle 3", 3, 48, 148);
    EggLaying eggLaying = new Eagle("eagle 4", 4, 55, 151);

    System.out.println(named);
    System.out.println(flying);
    System.out.println(eggLaying);
}}