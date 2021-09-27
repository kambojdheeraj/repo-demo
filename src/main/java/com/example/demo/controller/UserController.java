package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.UserRepo;
import com.example.demo.vo.User;

@RestController
public class UserController {
	@Autowired
	UserRepo repo;
	
	@GetMapping("users")
	  public ResponseEntity<List<User>> getAll() {
        return new ResponseEntity<>(repo.findAll(), HttpStatus.OK);
    }

}
