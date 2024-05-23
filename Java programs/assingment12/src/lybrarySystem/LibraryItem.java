package lybrarySystem;

public interface LibraryItem {
    void checkout(String title,String author);
    void returnItem(String title,String author);
}
