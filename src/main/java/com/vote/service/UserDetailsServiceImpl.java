package com.vote.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.vote.domain.User;
import com.vote.repositories.UserRepository;

public class UserDetailsServiceImpl implements UserDetailsService {

	
	@Autowired 
	private UserRepository m_UserRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user= m_UserRepo.findByUsername(username);
		if(user==null) throw new UsernameNotFoundException("Username not found");
		
		
		return null;
	}

}
