import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class LibraryTest {

    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
        library.addBook(new Book("1", "자바 기초", "Jane", 2021));
        library.addBook(new Book("2", "소프트웨어 공학", "Tom", 2014));
        library.addBook(new Book("3", "분산 컴퓨팅", "Yoon", 2024));
    }

    @Test
    void testAddDuplicateBook() {
        int initialSize = library.getBooks().size();
        assertFalse(library.addBook(new Book("1", "자바 기초", "Jane", 2021)));
        int finalSize = library.getBooks().size();
        assertEquals(initialSize, finalSize);
    }

    @Test
    void testSearchBook() {
        List<Book> searchResult = library.searchBook("자바");
        assertEquals(1, searchResult.size());
        assertEquals("자바 기초", searchResult.get(0).getTitle());

        searchResult = library.searchBook("소프트웨어");
        assertEquals(1, searchResult.size());
        assertEquals("소프트웨어 공학", searchResult.get(0).getTitle());

        searchResult = library.searchBook("분산");
        assertEquals(1, searchResult.size());
        assertEquals("분산 컴퓨팅", searchResult.get(0).getTitle());

        searchResult = library.searchBook("데이터베이스");
        assertTrue(searchResult.isEmpty());
    }

    @Test
    void testRemoveBook() {
        assertTrue(library.removeBook("1"));
        assertFalse(library.removeBook("1"));
    }


@Test
void testSearchBS() {
    Book book = library.search_bs("1");
    assertNotNull(book);
    assertEquals("자바 기초", book.getTitle());

    book = library.search_bs("2");
    assertNotNull(book);
    assertEquals("소프트웨어 공학", book.getTitle());

    book = library.search_bs("3");
    assertNotNull(book);
    assertEquals("분산 컴퓨팅", book.getTitle());

    book = library.search_bs("999");
    assertNull(book);
}
}