package com.example.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Skill {
	@Id
	@GeneratedValue
	private int skillId;
	private String skillName;

}
