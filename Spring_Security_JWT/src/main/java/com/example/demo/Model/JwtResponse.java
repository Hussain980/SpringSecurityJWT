package com.example.demo.Model;

public class JwtResponse {
	
	private String JwtToken;

	public String getJwtToken() {
		return JwtToken;
	}

	public void setJwtToken(String jwtToken) {
		JwtToken = jwtToken;
	}

	public JwtResponse(String jwtToken) {
		super();
		JwtToken = jwtToken;
	}
	

}
