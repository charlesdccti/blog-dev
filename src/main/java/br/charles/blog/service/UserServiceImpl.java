package br.charles.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.charles.blog.model.User;
import br.charles.blog.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	@SuppressWarnings("finally")
	private User findOne(String Id) {
		User instance = null;
		try {
			List < User > userList = userRepository.findAll();
			for (User user: userList) {
				if (user.getId().equals(Id)) {
					instance = user;
					break;
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			return instance;
		}
	}
	
	
	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}
	
	
	@Override
	public List < User > listUsers() {
		return userRepository.findAll();
	}
	
	
	@Override
	public User updateUser(String id, User user) {
		User updateInstance = this.findOne(id);
		updateInstance.setName(user.getName());
		return userRepository.save(updateInstance);
	}
	
	
	@Override
	public User deleteUser(String id) {
		User instance = findOne(id);
		userRepository.delete(instance);
		return instance;
	}
	
	
	@Override
	public User getUser(String id) {
		//return userRepository.findById(id).get();
		return this.findOne(id);
	}
	
}