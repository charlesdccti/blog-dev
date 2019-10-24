package br.charles.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.charles.blog.model.User;
import br.charles.blog.service.UserService;


@RestController
@RequestMapping("/api/v1/users")
public class UserServiceController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(method = RequestMethod.POST)
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public User updateUser(@PathVariable String id, @RequestBody User user) {
		return userService.updateUser(id, user);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List < User > listUsers() {
		return userService.listUsers();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public User getUser(@PathVariable String id) {
		return userService.getUser(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public User deleteUser(@PathVariable String id) {
		return userService.deleteUser(id);
	}
}