package com.example.demo.vo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("user")
public class User {

	@Id
	public Long id;
	public String name;
}
