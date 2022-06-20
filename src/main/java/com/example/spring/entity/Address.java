package com.example.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Address {
	
	@Id
	@GeneratedValue
	private int addrId;
	private String city;
	private String state;
	
}
