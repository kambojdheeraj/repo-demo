package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.vo.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long >{
	
	@Query("select * from user")
	List<User> findAll();
}
