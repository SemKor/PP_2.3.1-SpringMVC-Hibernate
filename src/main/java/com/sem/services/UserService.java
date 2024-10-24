package com.sem.services;

import com.sem.models.User;

import java.util.List;

public interface UserService {

    public List<User> showAllUsers();

    public void saveUser(User user);

    public User showUser(int id);

    public void updateUser(User user);

    public void deleteUser(int id);
}
