package com.data.userinfo.service;


import com.data.userinfo.Repository.UserRepository;
import com.data.userinfo.entity.User;
import com.data.userinfo.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UesrService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        String randomUserId = UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

   /* @Override
    public Optional<User> singleUser(String userId) {

            return userRepository.findById(userId);
    }*/
    @Override
    public User singleUser(String userId) {
        return userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User with given id is not found on server "+userId));
    }

    @Override
    public void deleteUserById(String userId) {
        User userEntity = userRepository.getReferenceById(userId);
         userRepository.delete(userEntity);

    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }
}
