package com.orazbakov.SpringBootCRUD.dao;

import com.orazbakov.SpringBootCRUD.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);

}
