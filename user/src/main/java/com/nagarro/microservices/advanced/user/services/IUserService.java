package com.nagarro.microservices.advanced.user.services;

import com.nagarro.microservices.advanced.user.models.User;

public interface IUserService {

	User findUserById(Long id);

}
