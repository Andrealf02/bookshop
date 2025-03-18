import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/library")
public class LibraryController {

    private final LibraryService libraryService;

    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @PostMapping("/borrow")
    public String borrowBook(@RequestParam String customerName, @RequestParam String bookTitle) {
        boolean success = libraryService.borrowBook(customerName, bookTitle);
        return success ? "El préstamo fue exitoso." : "El libro no está disponible.";
    }
}
