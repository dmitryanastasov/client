package com.myproject.service;

import org.springframework.http.ResponseEntity;
import com.myproject.model.Role;
import com.myproject.model.UserDTO;

public interface UserService {
    public ResponseEntity<String> getAllUsers();

    public void addUser(UserDTO userDTO);

     public void removeUser(UserDTO userDTO);

    public void updateUser(UserDTO userDTO);


}
