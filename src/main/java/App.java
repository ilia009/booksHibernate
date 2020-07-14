public class App {

    public static BookDaoImpl bookDao = new BookDaoImpl();

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.setId(1L);
        book1.setTitle("TITLE_1");
        book1.setPrice(1111);
        Book book2 = new Book();
        book2.setTitle("TITLE_2");

        bookDao.save(book1);
        System.out.println(bookDao.findById(1L));
        book1.setTitle("CHANGE_TITLE");
        bookDao.update(book1);

        bookDao.delete(book1);

        bookDao.findAll();

    }
}
