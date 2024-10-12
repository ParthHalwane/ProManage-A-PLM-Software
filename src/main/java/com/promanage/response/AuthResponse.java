package com.promanage.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {
	private String jwtString;
	private String message;

	public void setJwt(String jwtstring) {
		this.jwtString = jwtstring;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public String getJwt() {
		return jwtString;
	}
}
