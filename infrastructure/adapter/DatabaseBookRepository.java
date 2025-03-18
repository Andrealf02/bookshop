import java.util.Arrays;
import java.util.List;

public class DatabaseBookRepository implements BookRepository {

    @Override
    public List<Book> findAvailableBooks() {
        // Simulación: Obtener libros disponibles desde la "base de datos"
        System.out.println("Buscando libros disponibles en la base de datos...");
        return Arrays.asList(new Book("Cien Años de Soledad"),
                new Book("Don Quijote"));
    }

    @Override
    public void saveOrder(Order order) {
        // Simulación: Guardar el pedido en la "base de datos"
        System.out.println("Guardando el pedido: " + order);
    }
}
