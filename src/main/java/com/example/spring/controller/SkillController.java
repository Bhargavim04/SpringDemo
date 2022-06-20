package com.example.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.entity.Skill;
import com.example.spring.service.ISkillService;

@RestController
public class SkillController {
	
	@Autowired
	ISkillService skillServ;
	
	// add skill in db
	@PostMapping("/skill")
	ResponseEntity<Skill> addSkill(@RequestBody Skill skill) {
		Skill newSkill = skillServ.addSkill(skill);
		return new ResponseEntity<>(newSkill, HttpStatus.OK);
	}

}
