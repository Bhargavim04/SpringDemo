package com.example.spring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.entity.Login;
import com.example.spring.exception.InvalidCredentialsException;
import com.example.spring.repository.ILoginRepository;

@Service
public class LoginServiceImpl implements ILoginService {

	@Autowired
	ILoginRepository loginRepo;

	@Override
	public Login login(Login credentials) throws Exception { //email,passwd
		// get login details from db
		Optional<Login> dbLoginCred= loginRepo.findById(credentials.getEmail());
		
		if(dbLoginCred.isPresent()) {
			// compare db password with user provided password
			// if password matching return credentials else throw exception
			if(dbLoginCred.get().getPassword().equals(credentials.getPassword())) {
				return credentials;
			} else {
				throw new InvalidCredentialsException("Invalid password!");
			}
		} else {
			// throw exception if given email not present in the db. 
			throw new InvalidCredentialsException("Invalid credentials");
		}
		
	}


}
