package com.home.facebookclone.repos;


import com.home.facebookclone.models.friendslist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface friendslistrepo extends JpaRepository<friendslist, Long> {
}