package com.data.userinfo.controller;

import com.data.userinfo.entity.User;
import com.data.userinfo.service.UesrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class
UsersController {

    @Autowired
    private UesrService uesrService;

  /*  @PostMapping("/user")
    public User createUser(@RequestBody User user)
    {
        return uesrService.saveUser(user);
    }
*/
  //create user
    @PostMapping("/user")
   public  ResponseEntity<User> createUser(@RequestBody User user)
   {
       User user1 = uesrService.saveUser(user);
       return ResponseEntity.status(HttpStatus.CREATED).body(user1);
   }

    //all user get
    @GetMapping
    public ResponseEntity<List<User>> getAllUser()
    {
        List<User> user3=  uesrService.getAllUser();
        return ResponseEntity.ok(user3);
    }

    //single user get

   /* @GetMapping("/{userId}")
    public User getSingleUser(@PathVariable("userId") String userId )
    {
        return uesrService.singleUser(userId);
    }*/
     @GetMapping("/{userId}")
    public ResponseEntity<User> getSingleUser(@PathVariable("userId") String userId )
    {
        User user2= uesrService.singleUser(userId);
        return ResponseEntity.ok(user2);
    }



}
