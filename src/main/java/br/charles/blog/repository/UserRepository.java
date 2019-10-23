package br.charles.blog.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.charles.blog.model.User;


@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
}
