package ex08;

public class Girl implements Comparable<Girl>{
    private String name;
    private int age;

    public Girl(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s (%d) - %d", getName(), getAge(), hashCode());
    }

    public boolean equals(Object obj, String basedOn) {
        if (obj instanceof Girl) {
            Girl girl = (Girl) obj;
            if (basedOn.equals("age")) {
                return getName().equals(girl.getName());
            } else if (basedOn.equals("name")) {
                return getAge() == girl.getAge();
            } else if (basedOn.equals("nameAndAge")) {
                return getName().equals(girl.getName()) && getAge() == girl.getAge();
            } else{
                return false;
            }
        }else{
            return false;
        }
    }

    public int hashCode() {
        return getName().hashCode() + getAge();
    }

    @Override
    public int compareTo(Girl girl) {
        return getName().compareTo(girl.getName());
    }
}