public class QuantumBookstoreFullTest {
    public static void main(String[] args) {
        QuantumBookstore store = new QuantumBookstore();

        Book paperBook = new PaperBook("ISBN001", "Java Basics", 2020, 50.0, "John Smith", 10);
        Book ebook = new EBook("ISBN002", "Learn Java Fast", 2022, 30.0, "Anna Lee", "PDF");
        Book showcase = new ShowcaseBook("ISBN003", "The First Book", 2000, 0.0, "Albert Zen");

        store.addBook(paperBook);
        store.addBook(ebook);
        store.addBook(showcase);

        System.out.println("------ Buying Paper Book ------");
        store.buyBook("ISBN001", 2, "user@example.com", "123 Street, City");

        System.out.println("------ Buying EBook ------");
        store.buyBook("ISBN002", 1, "user@example.com", "");

        System.out.println("------ Trying to Buy Showcase Book ------");
        store.buyBook("ISBN003", 1, "", "");

        System.out.println("------ Removing Outdated Books (older than 10 years) ------");
        store.removeOutdatedBooks(10);
    }
}
