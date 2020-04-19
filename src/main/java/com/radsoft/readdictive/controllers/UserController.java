package com.radsoft.readdictive.controllers;

import com.radsoft.readdictive.controllers.models.UserListModel;
import com.radsoft.readdictive.controllers.models.UserModel;
import com.radsoft.readdictive.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@CrossOrigin("http://192.168.1.248:3000")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/create")
    public void createUser(@RequestBody UserModel userModel){
        userService.createUser(UserModel.toInternal(userModel));
    }

    @GetMapping("/id/{id}")
    public UserModel searchUserById(@PathVariable("id") Long id){
        return UserModel.toExternal(userService.getUserById(id));
    }

    @GetMapping("/role/{role}")
    public UserListModel searchUserByRole(@PathVariable("role") String role){
        return UserListModel.toExternal(userService.getUsersByRole(role));
    }
}
