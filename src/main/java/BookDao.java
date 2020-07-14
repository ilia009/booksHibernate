import java.util.List;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

public interface BookDao {

    public Book findById(long id) ;

    public void save(Book book)
            throws HeuristicRollbackException, RollbackException, HeuristicMixedException, SystemException;

    public void update(Book book)
            throws HeuristicRollbackException, RollbackException, HeuristicMixedException, SystemException;

    public void delete(Book book)
            throws HeuristicRollbackException, RollbackException, HeuristicMixedException, SystemException;

    public List<Book> findAll() ;
}
