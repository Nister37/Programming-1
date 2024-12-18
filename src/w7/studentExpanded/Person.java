package studentExpanded;

public class Person {
    private String name;
    private Contact contactData;
    public Person(String name, String email, String mobile, String fixed) {
        setName(name);
        setContact(email, mobile, fixed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact getContact() {
        return contactData;
    }

    public void setContact(String email, String mobile, String fixed) {
        this.contactData = new Contact(email,mobile,fixed);
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", contactData=" + contactData + "]";
    }
}
