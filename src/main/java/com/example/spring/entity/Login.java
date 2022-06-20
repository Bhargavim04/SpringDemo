package com.example.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Login {
	
	@Id
	private String email;
	private String password;
	
}
