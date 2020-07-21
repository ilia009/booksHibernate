package users;

import java.util.List;

public class UserService {
    private UserDao userDao = new UserDaoImpl();

    public UserService() {
    }

    public users.User findUser(int id) {
        return userDao.findById(id);
    }

    public void saveBook(users.User user) {
        userDao.save(user);
    }

    public void deleteBook(User user) {
        userDao.delete(user);
    }

    public void updateBook(User user) {
        userDao.update(user);
    }

    public List<User> findAllBooks() {
        return userDao.findAll();
    }

}
