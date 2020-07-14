import java.util.List;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

public class BookService {

    private BookDao bookDao = new BookDaoImpl();

    public BookService() {
    }

    public Book findUser(int id) {
        return bookDao.findById(id);
    }

    public void saveBook(Book book)
            throws HeuristicRollbackException, RollbackException, HeuristicMixedException, SystemException {
        bookDao.save(book);
    }

    public void deleteBook(Book book)
            throws HeuristicRollbackException, RollbackException, HeuristicMixedException, SystemException {
        bookDao.delete(book);
    }

    public void updateBook(Book book)
            throws HeuristicRollbackException, RollbackException, HeuristicMixedException, SystemException {
        bookDao.update(book);
    }

    public List<Book> findAllBooks() {
        return bookDao.findAll();
    }


}