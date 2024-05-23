package lybrarySystem;

public class Main {
    public static void main(String[] args) {
        LibraryItem book =new LibraryItem() {
            @Override
            public void checkout(String title, String author) {
                System.out.println("Book '" + title + "' by " + author + " has been checked out.");
            }

            @Override
            public void returnItem(String title, String author) {
                System.out.println("Book '" + title + "' by " + author + " has been returned.");
            }
        };
        LibraryItem DVD =new LibraryItem() {
            @Override
            public void checkout(String title, String author) {
                System.out.println("Book '" + title + "' by " + author + " has been checked out.");
            }

            @Override
            public void returnItem(String title, String author) {
                System.out.println("Book '" + title + "' by " + author + " has been returned.");
            }
        };
        LibraryItem journal =new LibraryItem() {
            @Override
            public void checkout(String title, String author) {
                System.out.println("Book '" + title + "' by " + author + " has been checked out.");
            }

            @Override
            public void returnItem(String title, String author) {
                System.out.println("Book '" + title + "' by " + author + " has been returned.");
            }
        };
    }

}
