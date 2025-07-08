import java.util.*;

public class QuantumBookstore {
    private Map<String, Book> inventory = new HashMap<>();

    public void addBook(Book book) {
        inventory.put(book.getIsbn(), book);
        System.out.println("Quantum book store: Book added - " + book.title);
    }

    public void removeOutdatedBooks(int yearsOld) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        List<String> toRemove = new ArrayList<>();

        for (Book book : inventory.values()) {
            if (currentYear - book.getYear() > yearsOld) {
                toRemove.add(book.getIsbn());
            }
        }

        for (String isbn : toRemove) {
            inventory.remove(isbn);
            System.out.println("Quantum book store: Removed outdated book with ISBN " + isbn);
        }
    }

    public void buyBook(String isbn, int quantity, String email, String address) {
        Book book = inventory.get(isbn);
        if (book == null) {
            System.out.println("Quantum book store: Book not found.");
            return;
        }

        try {
            book.buy(quantity, email, address);
        } catch (RuntimeException e) {
            System.out.println("Quantum book store: " + e.getMessage());
        }
    }
}
