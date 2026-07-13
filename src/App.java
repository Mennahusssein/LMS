import Dao.BookDAO;
import Model.Book;

public class App {

    public static void main(String[] args) {

        Book book =
                new Book(
                        "Clean Code",
                        "Robert Martin",
                        "Programming"
                        
                );

        BookDAO dao = new BookDAO();

        dao.addBook(book);
    }
}