package com.example.spring.service;

import com.example.spring.entity.Login;

public interface ILoginService {

	Login login(Login credentials) throws Exception;

}
