package com.data.userinfo.service;




import com.data.userinfo.entity.User;

import java.util.List;


public interface UesrService {

   //create
    User saveUser(User user);

    //get all user
    List<User> getAllUser();


    //get single user
    User singleUser(String userId);

    //delete
    void deleteUserById(String userId);

    //update user
    public User updateUser(User user);

}
