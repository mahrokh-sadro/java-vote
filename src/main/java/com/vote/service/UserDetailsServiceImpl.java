package com.vote.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vote.domain.User;
import com.vote.repositories.UserRepository;
import com.vote.security.CustomSecurityUser;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	
	@Autowired 
	private UserRepository m_userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user= m_userRepo.findByUsername(username);
		if(user==null) throw new UsernameNotFoundException("Username not found");
		
		return new CustomSecurityUser(user);
	}

}
