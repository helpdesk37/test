package com.jiratool.config;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jiratool.entity.UserLogin;
import com.jiratool.repo.UserRepository;

@Service
public class MyUserDetails implements UserDetailsService {

	private final UserRepository userRepository;

    public MyUserDetails(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<UserLogin> byUserName = userRepository.findByUserName(username);
		UserLogin userLogin = byUserName.get();
		return new User(userLogin.getUserName(),userLogin.getPassword(),new ArrayList<>());
	}

}
