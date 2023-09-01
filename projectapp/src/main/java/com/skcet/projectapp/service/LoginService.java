package com.skcet.projectapp.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.skcet.projectapp.model.LoginPage;

public interface LoginService {

	public boolean addUser(LoginPage login);
	public List<LoginPage> getUser();
	public boolean updateUser(Long id, LoginPage login);
	public boolean deleteUser(Long id);
	public Page<LoginPage> getAllUser(PageRequest pageRequest);
	List<LoginPage> findAllQuery();
	
	public LoginPage findUsermail();
	LoginPage findByUsermail(String usermail);
	LoginPage findByUsermail();
	
}

