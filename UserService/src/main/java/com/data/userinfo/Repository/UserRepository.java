package com.data.userinfo.Repository;


import com.data.userinfo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    //we can implement any custom query or method

}


