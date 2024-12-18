package example;

public class Character extends Attacker implements Speaker{
    private String name;

    public Character(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()) {
            System.out.println("Name cannot be empty");
            this.name = "Default";
        }else {
            this.name = name;
        }
    }

    @Override
    void attack() {
        super.attack();
    }

    @Override
    public void speak() {

    }
}
