import java.util.ArrayList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<String> myFirstList = new ArrayList<String>();
        myFirstList.add("Albert");
        myFirstList.add("John");
        myFirstList.add("Mary");
        myFirstList.add("Jane");
        myFirstList.add("Jack");

        System.out.println(myFirstList.get(0));
        System.out.println(myFirstList.get(myFirstList.size() - 1));

        for(String name : myFirstList) {
            System.out.println(name);
        }

        boolean georgePresent;
        georgePresent = myFirstList.contains("George");
        System.out.println(georgePresent);

        for(int i=0;i<myFirstList.size();i++) {
            String name = myFirstList.get(i).substring(0,1);
            System.out.println(name.toLowerCase());
            if(name.equalsIgnoreCase("a")){
                myFirstList.remove(i--);
            }
        }
        System.out.println(myFirstList);
    }
}
