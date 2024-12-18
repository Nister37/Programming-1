package Ex01.ex01book;

public class Book {
    private String author;
    private String title;
    private int pages;
    private boolean onLoan;

    public Book(String author, String title, int pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;
        this.onLoan = false;
    }
    public Book(){
        this("unknown","unknown",0);
    }
    public String get_author(){
        return author;
    }
    public String get_title(){
        return title;
    }
    public int get_pages(){
        return pages;
    }
    public boolean get_onLoan(){
        return onLoan;
    }
    public void set_author(String author){
        this.author = author;
    }
    public void set_title(String title){
        this.title = title;
    }
    public void set_pages(int pages){
        this.pages = pages;
    }
    public void set_onLoan(boolean onLoan) {
        this.onLoan = onLoan;
    }
    @Override
    public String toString(){
        String onLoan = this.onLoan ? " is on loan." : " is avaliable.";
        return "Book " + this.title + "(" + this.pages + " pages), written by " + this.author + onLoan;
    }
}
