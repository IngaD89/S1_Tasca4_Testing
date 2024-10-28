package nivell1.exercici1;

import static org.junit.jupiter.api.Assertions.*;

import org.example.nivell1.exercici1.BookAlreadyExistsException;
import org.example.nivell1.exercici1.BookDoesNotExistsException;
import org.example.nivell1.exercici1.BookPositionDoesNotExistsException;
import org.example.nivell1.exercici1.Library;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

public class LibraryTest {

    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library();
    }

    public void createLibrary() {
        try {
            library.addBook("Book 1");
            library.addBook("Book 2");
        } catch (BookAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void assertLibraryIsNotNul() {
        assertNotNull(library.getAllBooks());
    }

    @Test
    public void verifyListSizeAfterAddBook() {
        createLibrary();
        assertEquals(2, library.getBookListSize());
    }

    @Test
    public void assertBookIsAtCorrectPosition() {
        try {
            library.addBook("Book at position 0");
            assertEquals("Book at position 0", library.getBookByPosition(0));
        } catch (BookAlreadyExistsException e) {
            System.out.println(e.getMessage());
        } catch (BookPositionDoesNotExistsException e) {
            System.out.println("ERROR " + e.getMessage());
        }
    }

    @Test
    public void assertBookAddedAtSpecificPosition() {
        try {
            library.addBook("Book 1");
            library.addBookAtSpecificPosition(0, "Book 0");
            assertEquals("Book 0", library.getBookByPosition(0));
        } catch (BookAlreadyExistsException e) {
            System.out.println(e.getMessage());
        } catch (BookPositionDoesNotExistsException e) {
            System.out.println("ERROR " + e.getMessage());
        }
    }

    @Test
    public void assertThereAreNoDuplicates() {
        try {
            library.addBook("Duplicate");
        } catch (BookAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        Exception duplicateException = assertThrows(BookAlreadyExistsException.class, () -> library.addBook("Duplicate"));
        assertEquals("Book already exists", duplicateException.getMessage());

        assertEquals(1, library.getBookListSize(), "List should contain just one element");
    }

    @Test
    public void verifyGetBookByPosition() {
        try {
            library.addBookAtSpecificPosition(0, "Book 0");
            library.addBookAtSpecificPosition(1, "Book 1");
            assertEquals("Book 1", library.getBookByPosition(1));
        } catch (BookAlreadyExistsException e) {
            System.out.println(e.getMessage());
        } catch (BookPositionDoesNotExistsException e) {
            System.out.println("ERROR " + e.getMessage());
        }
    }

    @Test
    public void assertAddBookModifiesListCorrectly() {
        try {
            library.addBook("Book 2");
            library.addBook("Book 0");
            library.addBook("Book 1");
        } catch (BookAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        List<String> books = library.getAllBooks();
        assertEquals("Book 0", books.get(0));
        assertEquals("Book 1", books.get(1));
        assertEquals("Book 2", books.get(2));
    }

    @Test
    public void verifyListSizeAfterDelete() {
        try {
            library.addBook("Book 0");
            library.addBook("Book 1");
            library.addBook("Book 2");
            library.deleteBook("Book 1");
        } catch (BookAlreadyExistsException | BookDoesNotExistsException e) {
            System.out.println(e.getMessage());
        }
        assertEquals(2, library.getBookListSize());
    }

    @Test
    public void assertListIsOrderedAfterAddOrDelete() {
        try {
            library.addBook("Book A");
            library.addBook("Book B");
            library.addBook("Book C");
            library.addBook("Book D");
            library.deleteBook("Book B");
        } catch (BookAlreadyExistsException e) {
            System.out.println(e.getMessage());
        } catch (BookDoesNotExistsException e) {
            System.out.println("ERROR " + e.getMessage());
        }
        List<String> books = library.getAllBooks();
        assertEquals("Book A", books.get(0));
        assertEquals("Book C", books.get(1));
        assertEquals("Book D", books.get(2));
    }

}
