package Librarymanage3;
import java.util.ArrayList;
import java.util.List;
public class LibraryBookManagement {
    private List<Book> books;

    public LibraryBookManagement() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBookByIsbn(String isbn) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn().equals(isbn)) {
                books.remove(i);
                break;
            }
        }
    }

    public Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public void displayBooksPublishedAfterYear(int year) {
        for (Book book : books) {
            if (book.getYearPublished() > year) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        LibraryBookManagement library = new LibraryBookManagement();
        library.addBook(new Book("1234", "Java Programming", "John Doe", 2020));
        library.addBook(new Book("5678", "Data Structures", "Jane Smith", 2018));
        library.addBook(new Book("91011", "Algorithms", "Alice Johnson", 2019));

        // Display all books
        System.out.println("All books:");
        for (Book book : library.books) {
            System.out.println(book);
        }
        System.out.println();

        // Remove book by ISBN
        System.out.println("Remove book by ISBN:");
        library.removeBookByIsbn("1234");
        for (Book book : library.books) {
            System.out.println(book);
        }
        System.out.println();

        // Find book by ISBN
        System.out.println("Find book by ISBN:");
        Book foundBook = library.findBookByIsbn("5678");
        if (foundBook != null) {
            System.out.println(foundBook);
        } else {
            System.out.println("Book not found");
        }
        System.out.println();

        // Display books published after a specified year
        System.out.println("Books published after 2019:");
        library.displayBooksPublishedAfterYear(2019);
    }
}