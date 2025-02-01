package app.service;

import app.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(long id);
    void save(User user);
    void update(long id, User updatedUser);
    void delete(long id);
}
