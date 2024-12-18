package ex05;

public class Movie {
    public class Actor{
        private String name;

        public Actor(String name){
            setName(name);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return String.format("%s", getName());
        }
    }

    private String title;
    private int year;
    private Actor leadingRole;
    private Actor supportingRole;

    public Movie(String title, int year, String leadingRole, String supportingRole){
        if(leadingRole == null){
            setLeadingRole(null);
        }else{
            this.leadingRole = new Actor(leadingRole);
        }
        if(supportingRole == null){
            setSupportingRole(null);
        }else{
            this.supportingRole = new Actor(supportingRole);
        }
        setYear(year);
        this.title = title;
    }

    public Movie(String title, int year){
        this(title, year, null, null);
    }

    public Movie(String title){
        this(title, 0, null, null);
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public Actor getLeadingRole() {
        return leadingRole;
    }

    public Actor getSupportingRole() {
        return supportingRole;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLeadingRole(Actor leadingRole) {
        this.leadingRole = leadingRole;
    }

    public void setSupportingRole(Actor supportingRole) {
        this.supportingRole = supportingRole;
    }

    @Override
    public String toString() {
        return String.format("Title: %-40s; Year: %-10s; Cast: %-10s, %-10s", getTitle(), getYear(),getLeadingRole(), getSupportingRole());
    }
}
