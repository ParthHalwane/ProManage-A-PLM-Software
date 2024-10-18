package com.promanage.service;

import com.promanage.modal.User;

public interface UserService {
	User findUserProfileByJwt(String jwt) throws Exception;
	
	User findUserByEmail(String email) throws Exception;
	
	User findUserById(Long userId) throws Exception;
	
	User updateUsersProjcetSize(User user, int number) throws Exception;
} 
