package infrastructure.adapter;

import java.util.Arrays;
import java.util.List;

/**
 * Implementación del puerto BookRepository para interactuar con la base de datos.
 * Esta clase simula la persistencia utilizando datos ficticios.
 */
public class DatabaseBookRepository implements BookRepository {

    /**
     * Recupera una lista de libros disponibles desde la "base de datos".
     * @return Una lista de libros disponibles.
     */
    @Override
    public List<Book> findAvailableBooks() {
        System.out.println("Buscando libros disponibles en la base de datos...");

        // Simulación de datos: Lista estática de libros disponibles
        return Arrays.asList(
                new Book("Cien Años de Soledad"),
                new Book("Don Quijote")
        );
    }

    /**
     * Guarda un pedido de libro en la "base de datos".
     * @param order El pedido que se desea guardar.
     */
    @Override
    public void saveOrder(Order order) {
        System.out.println("Guardando el pedido en la base de datos...");

        // Simulación de guardado del pedido
        System.out.println("Pedido guardado: " + order);
    }
}
