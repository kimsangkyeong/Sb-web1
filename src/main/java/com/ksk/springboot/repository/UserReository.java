package com.ksk.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ksk.springboot.model.User;

@Repository
public interface UserReository extends JpaRepository<User, Long>{

}
