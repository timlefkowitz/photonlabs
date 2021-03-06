package com.home.facebookclone.repos;


import com.home.facebookclone.models.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsersRepository extends JpaRepository<user, Long> {


//    user findByUsername(String userName);
    user getByUsername(String statusOwner);
    user findByUsername(String username);


//    user getBycontactListOwner(String username);
//    user getByBlogPost(user BlogPost);
//
//    String getUsername(String username);
}
