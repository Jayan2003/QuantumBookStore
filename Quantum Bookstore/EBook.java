public class EBook extends Book {
    private String fileType;

    public EBook(String isbn, String title, int year, double price, String author, String fileType) {
        super(isbn, title, year, price, author);
        this.fileType = fileType;
    }

    @Override
    public void buy(int quantity, String email, String address) {
        if (quantity > 1) {
            throw new RuntimeException("Quantum book store: Only 1 copy allowed for eBooks.");
        }
        System.out.println("Quantum book store: Total paid = " + price);
        System.out.println("Quantum book store: EBook sent to " + email);
    }
}
