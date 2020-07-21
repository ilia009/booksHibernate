package users;

import java.util.List;

public interface UserDao {

    public User findById(long id);

    public void save(User user);

    public void update(User user);

    public void delete(User user);

    public List<User> findAll() ;

}
