package goods;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import utils.HibernateUtil;

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

    @Override
    public List<Book> findAllBooksInPriceAverage(int low, int hight) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Book> criteriaQuery = builder.createQuery(Book.class);
        Root<Book> root = criteriaQuery.from(Book.class);

        criteriaQuery.select(root).where(builder.between(root.get("price"), low, hight));

        Query<Book> query = session.createQuery(criteriaQuery);
        return query.getResultList();
    }

    @Override
    public void testHql(Book book) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String query = String.format("INSERT INTO book (title, price) VALUES('%s',%s);",book.getTitle(), book.getPrice());
        session.createSQLQuery(query).executeUpdate();
        session.getTransaction().commit();
        session.close();
    }


}
