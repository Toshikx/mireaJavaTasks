package ru.mirea.ikbo_16_19.isaev;

public class Book {
    private int pageCount;
    private String desription;

    public Book(int pageCount) {
        this.pageCount = pageCount;
        this.desription = null;
    }

    public Book(int pageCount, String desription) {
        this.pageCount = pageCount;
        this.desription = desription;
    }

    public Book(String desription) {
        this.desription = desription;
        this.pageCount = 10;
    }
    public Book() {
        this.desription = null;
        this.pageCount = 10;
    }

    @Override
    public String toString() {
        return "Book{" +
                "pageCount=" + pageCount +
                ", desription='" + desription + '\'' +
                '}';
    }
}

class TestBook {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book.toString());
    }
}
