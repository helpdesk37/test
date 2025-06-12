package com.jiratool.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiratool.entity.UserLogin;
import com.jiratool.repo.UserProfileRepository;

@Service
public class UserProfileService {

	@Autowired
	private UserProfileRepository userProfileRepository;

	public UserLogin createUser(UserLogin userLogin) {
		return userProfileRepository.save(userLogin);
	}
}
