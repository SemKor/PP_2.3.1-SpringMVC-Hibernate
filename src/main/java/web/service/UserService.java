package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    List<User> showAllUsers();

    User showUserById(int id);

    void saveUser(User user);

    void updateUser(int id, User user);

    void deleteUser(int id);
}
