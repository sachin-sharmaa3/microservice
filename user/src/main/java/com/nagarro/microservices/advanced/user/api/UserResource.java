package com.nagarro.microservices.advanced.user.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.microservices.advanced.user.models.User;
import com.nagarro.microservices.advanced.user.services.IUserService;

@RestController
public class UserResource {

	@Autowired
	private IUserService userService;

	@GetMapping("user/1")
	public ResponseEntity<User> getMe() {
		return ResponseEntity.ok(this.userService.findUserById(1L));
	}

}
