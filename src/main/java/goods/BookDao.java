package goods;

import java.util.List;

public interface BookDao {

    public Book findById(long id);

    public void save(Book book);

    public void update(Book book);

    public void delete(Book book);

    public List<Book> findAll();

    public  List<Book> findAllBooksInPriceAverage(int low, int hight);

    public void testHql(Book book);
}
