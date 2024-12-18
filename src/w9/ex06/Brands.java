package ex06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Brands {
    final private ArrayList<String> brands =  new ArrayList<>(Arrays.asList(Data.brands));
    public void alphabetic(){
        Collections.sort(brands);
    }
    public void alphabeticDescending(){
        Collections.sort(brands, Collections.reverseOrder());
    }
    @Override
    public String toString() {
        return String.format("%s", brands.toString());
    }
}
