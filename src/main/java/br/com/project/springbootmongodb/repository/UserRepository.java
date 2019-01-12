package br.com.project.springbootmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.project.springbootmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
