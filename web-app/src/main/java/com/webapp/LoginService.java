package com.webapp;

public class LoginService {

	public boolean validate(String name, String passord) {
		if ("subhash".equals(name) && "reddy".equals(passord))
			return true;
		return false;
	}
}
