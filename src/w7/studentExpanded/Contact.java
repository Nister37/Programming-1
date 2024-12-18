package studentExpanded;

public class Contact{
    private String email;
    private Phone mobile;
    private Phone fixed;
    public Contact(String email, String fixedNumber, String mobileNumber) {
        setEmail(email);
        setFixed(fixedNumber);
        setMobile(mobileNumber);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Phone getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = new Phone(mobile,"mobile");
    }

    public Phone getFixed() {
        return fixed;
    }

    public void setFixed(String fixed) {
        this.fixed = new Phone(fixed,"fixed");
    }
    @Override
    public String toString() {
        return "Contact [email=" + email + ", mobile=" + mobile + ", fixed=" + fixed + "]";
    }
}
