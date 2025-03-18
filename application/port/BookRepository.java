import java.util.List;

public interface BookRepository {
    List<Book> findAvailableBooks();
    void saveOrder(Order order);
}
