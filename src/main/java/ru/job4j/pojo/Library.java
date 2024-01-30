package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 500);
        Book book1 = new Book("Book1", 100);
        Book book2 = new Book("Book2", 200);
        Book book3 = new Book("Book3", 300);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;
        for (Book book : books) {
            System.out.println(book.getTitle() + " - " + book.getQuantity());
        }
        books[0] = book3;
        books[3] = cleanCode;
        for (Book book : books) {
            System.out.println(book.getTitle() + " - " + book.getQuantity());
        }
        for (Book book : books) {
            if (book.getTitle().equals("Clean code")) {
                System.out.println(book.getTitle() + " - " + book.getQuantity());
            }
        }

    }
}
