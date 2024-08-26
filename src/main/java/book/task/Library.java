package book.task;

import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }
    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void add(Book book) {
        books = Arrays.copyOf(books, books.length + 1);
        books[books.length - 1] = book;
    }

    public void remove(Book book) {
        int index = -1;
        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(book)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            Book[] newBooks = new Book[books.length - 1];
            for (int i = 0; i < newBooks.length; i++) {
                newBooks[i] = books[i];
            }
            books = newBooks;
        }
    }
    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
