import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BookDaoImpl implements BookDao {
    public Book findById(long id) {
        return HibernateUtil.getSessionFactory().openSession().get(Book.class, id);
    }

    public void save(Book book) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(book);
        transaction.commit();
        session.close();
    }

    public void update(Book book) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(book);
        transaction.commit();
        session.close();
    }

    public void delete(Book book) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(book);
        transaction.commit();
        session.close();
    }

    public List<Book> findAll() {
        return HibernateUtil.getSessionFactory().openSession().createQuery("From Book").list();
    }
}
