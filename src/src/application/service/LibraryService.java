package application.service;

import java.util.List;

public class LibraryService {

    private final BookRepository bookRepository;

    public LibraryService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public boolean borrowBook(String customerName, String bookTitle) {
        List<Book> availableBooks = bookRepository.findAvailableBooks();
        Book bookToBorrow = availableBooks.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(bookTitle))
                .findFirst()
                .orElse(null);

        if (bookToBorrow != null) {
            Order order = new Order(customerName, bookTitle);
            bookRepository.saveOrder(order);
            return true;
        } else {
            return false;
        }
    }
}
