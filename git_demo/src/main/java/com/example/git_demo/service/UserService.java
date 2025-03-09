package com.example.git_demo.service;

import org.apache.catalina.User;

public interface UserService {

     void save(User user);

     User getUserById (int id);
}
