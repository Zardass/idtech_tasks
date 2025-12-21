package librarymanagement;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book = new Book("yer altindan notlar","Dostoyevski",1930,true);
        Book book1 = new Book("Harry Potter","J.",1930,true);

        library.addBook(book);
        library.addBook(book1);
        library.showAvailableBooks();

        book.borrow();

        library.showAvailableBooks();


    }
}
