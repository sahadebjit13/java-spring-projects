package com.iiht.BootSecurityJDBC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iiht.BootSecurityJDBC.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String> {

}
