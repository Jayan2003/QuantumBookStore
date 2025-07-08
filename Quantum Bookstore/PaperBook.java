public class PaperBook extends Book {
    private int stock;

    public PaperBook(String isbn, String title, int year, double price, String author, int stock) {
        super(isbn, title, year, price, author);
        this.stock = stock;
    }

    @Override
    public void buy(int quantity, String email, String address) {
        if (stock < quantity) {
            throw new RuntimeException("Quantum book store: Not enough stock.");
        }
        stock -= quantity;
        System.out.println("Quantum book store: Total paid = " + (price * quantity));
        System.out.println("Quantum book store: Paper book will be shipped to " + address);
    }
}
