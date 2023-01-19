package com.bloque5rubrica2.springboot.bloque5rubrica2.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	// Boolean method for user and password validation
	public boolean validateUser(String userid, String password) {
        return userid.equalsIgnoreCase("user") && password.equalsIgnoreCase("pass");
    }
}
