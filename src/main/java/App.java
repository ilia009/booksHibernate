import goods.Book;
import goods.BookService;
import java.util.ArrayList;
import java.util.List;
import users.User;
import users.UserService;

public class App {

    public static UserService userService = new UserService();
    public static BookService bookService = new BookService();

    public static void main(String[] args) {
createAndSaveBooks();

        System.out.println(bookService.averagePrice(20, 1000));
    }

    private static void createAndSaveUsers(){
        User user = new User();
        user.setId(1L);
        user.setFirst_name("USER_1");
        userService.saveBook(user);

    }
    private static void createAndSaveBooks(){
        Book book = new Book();
        book.setId(1L);
        book.setTitle("TITLE_1");
        book.setPrice(4);

        Book book1 = new Book();
        book.setId(2L);
        book.setTitle("TITLE_1");
        book.setPrice(500);

        Book book2 = new Book();
        book.setId(3L);
        book.setTitle("TITLE_1");
        book.setPrice(222);

        List<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book1);
        books.add(book2);
        bookService.saveBooks(books);
    }


    

}
