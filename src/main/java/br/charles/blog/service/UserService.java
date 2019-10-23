package br.charles.blog.service;

import java.util.List;

import br.charles.blog.model.User;

public interface UserService {
	
	 User createUser(User user);
	 User updateUser(String id, User user);
	 User deleteUser(String id);
	 User getUser(String id);
	 
	 List<User> listUsers(); 
}