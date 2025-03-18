import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/library")
public class LibraryController {

    private final LibraryService libraryService;

    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }
    /**
     * Endpoint para gestionar cuando prestamos un libro.
     *
     * @param customerName Nombre del cliente que solicita el préstamo.
     * @param bookTitle Título del libro que desea prestar.
     * @return Mensaje indicando si el préstamo fue exitoso o no.
     */
    @PostMapping("/borrow")
    public String borrowBook(@RequestParam String customerName, @RequestParam String bookTitle) {
        boolean success = libraryService.borrowBook(customerName, bookTitle);
        return success ? "El préstamo fue exitoso." : "El libro no está disponible.";
    }
}
