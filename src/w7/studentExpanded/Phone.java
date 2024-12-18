package studentExpanded;

public class Phone {
    private String number;
    private String type;
    private final int LENGTH_MOBILE = 10;
    private final int LENGTH_FIXED = 9;

    public Phone(String number,String type) {
        setNumber(number);
        setType(type);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if(type=="fixed" || type=="mobile") {
            this.type = type;
        }else{
            System.out.println("Invalid type");
        }
    }
    public boolean isValid() {
        boolean startsWithZero = getNumber().startsWith("0");
        boolean correctLenght;
        if (getType()=="fixed" && LENGTH_FIXED==getNumber().length()) {
            correctLenght = true;
        } else if (getType()=="mobile" && LENGTH_MOBILE==getNumber().length()) {
            correctLenght = true;
        } else{
            correctLenght = false;
        }
        return correctLenght;
    }

    @Override
    public String toString() {
        return "Phone [number=" + number + "]";
    }
}
