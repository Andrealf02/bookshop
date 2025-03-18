package domain.model;

public class Order {
    private final String customerName;
    private final String bookTitle;

    public Order(String customerName, String bookTitle) {
        this.customerName = customerName;
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() {
        return "Cliente: " + customerName + ", Libro: " + bookTitle;
    }
}
