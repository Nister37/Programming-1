import Ex01.ex01book.Book;

public class Ex01 {
    public static void main(String[] args) {
        Book book = new Book();
        Book book2 = new Book("Me","Why Java is worse than Python",1);

        System.out.println(book + "\n" + book2);
    }
}