package world.belto.ai.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import world.belto.ai.api.model.User;
import world.belto.ai.service.UserService;

@RestController
public class UserController {

	private UserService userService;
	
	
	@Autowired
	public UserController(UserService user_service) {
		this.userService = user_service;
	}
	
	@GetMapping("/user")
	public User getUser(@RequestParam Integer id) {
		Optional user = userService.getUser(id);
		if(user.isPresent()) {
			return (User) user.get();
		}
		return null;
	}
	
	
	
	
	
}
