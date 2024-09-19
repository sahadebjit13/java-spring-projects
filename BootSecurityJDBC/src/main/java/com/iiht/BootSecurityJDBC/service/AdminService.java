package com.iiht.BootSecurityJDBC.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.iiht.BootSecurityJDBC.model.Admin;
import com.iiht.BootSecurityJDBC.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	AdminRepository adminRepository;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	public void save(Admin admin) {
		admin.setPassword(passwordEncoder.encode(admin.getPassword()));
		adminRepository.save(admin);
	}
	
	public Optional<Admin> findByUsername(String username){
		return adminRepository.findById(username);
	}
}
