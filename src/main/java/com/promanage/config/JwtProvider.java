package com.promanage.config;

import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.security.core.Authentication;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

public class JwtProvider {
	static SecretKey key = Keys.hmacShaKeyFor(JwtConstant.SECRET_KEY.getBytes());

	public static String generateToken(Authentication auth) {
		 @SuppressWarnings("deprecation")
		String jwt = Jwts.builder()
	                .setIssuedAt(new Date())  // Set token issue time
	                .setExpiration(new Date(new Date().getTime() + 86400000))  // Set expiration time (24 hours)
	                .claim("email", auth.getName())  // Store email as a claim in the JWT
	                .signWith(key)  // Sign the JWT with the secret key
	                .compact();  // Build the JWT

	        return jwt;
	}
	
	public static String getEmailFromToken(String jwt) {
		Claims claims = Jwts.parser()
			    .verifyWith(key)
			    .build()
			    .parseSignedClaims(jwt)
			    .getPayload();

        // Extract the email from the claims
        String email = String.valueOf(claims.get("email"));
        return email;
    }
}
