package com.example.demo.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.UserDAO;

@Service
@Transactional
public class UserService {

	private UserDAO userdao;
	
	
}
