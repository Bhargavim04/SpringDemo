package com.example.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.entity.Skill;
import com.example.spring.repository.ISkillRepository;

@Service
public class SkillServiceImpl implements ISkillService{

	@Autowired
	ISkillRepository skillRepo;

	@Override
	public Skill addSkill(Skill skill) {
		
		return skillRepo.save(skill);
	}

}
