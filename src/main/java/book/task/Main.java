package book.task;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Book1" , "Auther1" , "h1hh1");
        Book book2 = new Book("Book2" , "Auther2" , "f2ff223");
        Book book3 = new Book("Book3" , "Auther3" , "ilkdfj");

        Book[] books = {book, book2, book3};

        Library library = new Library(books);

        System.out.println(book);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println(library);

        library.add(book2);
        System.out.println(library);
        library.remove(book2);
        System.out.println(library);

    }
}
