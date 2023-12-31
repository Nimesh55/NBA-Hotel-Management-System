package com.nba.hotel_management_system.service;

import com.nba.hotel_management_system.model.User;

import java.util.List;

public interface IUserService {
    User registerUser(User user);
    List<User> getUsers();
    void deleteUser(String email);
    User getUser(String email);
}
