package com.iiht.BootSecurityJDBC.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iiht.BootSecurityJDBC.model.User;

public interface UserRepository extends JpaRepository<User, String> {

}
