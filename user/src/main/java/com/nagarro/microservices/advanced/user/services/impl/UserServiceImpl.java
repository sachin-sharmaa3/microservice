package com.nagarro.microservices.advanced.user.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.microservices.advanced.user.models.User;
import com.nagarro.microservices.advanced.user.repositories.IUserRepository;
import com.nagarro.microservices.advanced.user.services.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserRepository userRepository;

	@Override
	public User findUserById(Long id) {
		return this.userRepository.findById(id).get();
	}

}
