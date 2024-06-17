import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public boolean addBook(Book book) {
        for (Book b : books) {
            if (b.getId().equals(book.getId())) {
            	System.out.println("해당 ID(" + book.getId() + ") 는 이미 존재합니다.");
            	return false; // 중복된 도서 ID
            }
        }
        books.add(book);
        System.out.println(book + "도서가 추가되었습니다.");
        return true; // 도서 추가 성공
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Book> searchBook(String keyword) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().contains(keyword)) {
                result.add(book);
            }
        }
        if (result.isEmpty()) {
            System.out.println("검색된 도서가 없습니다.");
        } else {
            System.out.println("검색 결과:");
            for (Book book : result) {
                System.out.println(book);
            }
        }
        return result;
    }

    public boolean removeBook(String id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                books.remove(book);
                System.out.println(book + "도서를 삭제하였습니다.");
                return true;
            }
        }
        System.out.println("해당 ID(" + id + ")의 도서를 찾을 수 없습니다.");
        return false;
    }
}
