package DAO;

import entity.User;

import java.util.List;

public interface userDao {
    void create(User user);
    void update(User user);

    void delete(int user_id);

    User get(int id);
    List<User> getAll();
}
