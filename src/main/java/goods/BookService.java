package goods;

import java.util.Collection;
import java.util.List;

public class BookService {

    private BookDao bookDao = new BookDaoImpl();

    public BookService() {
    }

    public Book findUser(int id) {
        return bookDao.findById(id);
    }

    public void saveBook(Book book) {
        bookDao.save(book);
    }

    public void deleteBook(Book book) {
        bookDao.delete(book);
    }

    public void updateBook(Book book) {
        bookDao.update(book);
    }

    public List<Book> findAllBooks() {
        return bookDao.findAll();
    }

    public List<Book> averagePrice(int low, int hight) {
        return bookDao.findAllBooksInPriceAverage(low, hight); }

    public void saveBooks(Collection<Book> books){
        for (Book book: books) {
            bookDao.save(book);
        }
    }

}