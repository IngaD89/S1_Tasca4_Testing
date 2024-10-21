package nivell1.exercici1;

import static org.junit.jupiter.api.Assertions.*;
import org.example.nivell1.exercici1.Library;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

public class LibraryTest {

    private Library library;

    @BeforeEach
    public void setUp(){
        library = new Library();
    }

    @Test
    public void assertLibraryIsNotNul(){
        assertNotNull(library.getAllBooks());
    }

    @Test
    public void verifyListSizeAfterAddBook(){
        library.addBook("Book 1");
        library.addBook("Book 2");
        assertEquals(2, library.getBookListSize());
    }

    @Test
    public void assertBookIsAtCorrectPosition(){
        library.addBook("Book at position 0");
        assertEquals("Book at position 0", library.getBookByPosition(0));
    }

    @Test
    public void assertBookAddedAtSpecificPosition(){
        library.addBook("Book 1");
        library.addBookAtSpecificPosition(0, "Book 0");
        assertEquals("Book 0", library.getBookByPosition(0));
    }

    @Test
    public void assertThereAreNoDuplicates(){
        library.addBook("Duplicate");
        library.addBook("Duplicate");
        assertEquals(1, library.getBookListSize());
    }

    @Test
    public void verifyGetBookByPosition(){
        library.addBookAtSpecificPosition(0, "Book 0");
        library.addBookAtSpecificPosition(1, "Book 1");
        assertEquals("Book 1", library.getBookByPosition(1));
    }

    @Test
    public void assertAddBookModifiesListCorrectly(){
        library.addBook("Book 2");
        library.addBook("Book 0");
        library.addBook("Book 1");
        List<String> books = library.getAllBooks();
        assertEquals("Book 0", books.get(0));
        assertEquals("Book 1", books.get(1));
        assertEquals("Book 2", books.get(2));
    }

    @Test
    public void verifyListSizeAfterDelete(){
        library.addBook("Book 0");
        library.addBook("Book 1");
        library.addBook("Book 2");
        library.deleteBook("Book 1");
        assertEquals(2, library.getBookListSize());
    }

    @Test
    public void assertListIsOrderedAfterAddOrDelete(){
        library.addBook("Book A");
        library.addBook("Book B");
        library.addBook("Book C");
        library.addBook("Book D");
        library.deleteBook("Book B");
        List<String> books = library.getAllBooks();
        assertEquals("Book A", books.get(0));
        assertEquals("Book C", books.get(1));
        assertEquals("Book D", books.get(2));
    }

}
