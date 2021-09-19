package com.vote.security;


import java.util.*;

import org.springframework.security.core.userdetails.UserDetails;

import com.vote.domain.User;


public class CustomSecurityUser extends User implements UserDetails{

	
	//cuz UserDetails implements serializable
	private static final long serialVersionUID = -2040291138946598463L;
	
	public CustomSecurityUser() {};
	public CustomSecurityUser(User user) {
		
		this.setAuthorities(user.getAuthorities());
		this.setId(user.getId());
		this.setName(user.getUsername());
		this.setPassword(user.getPassword());
		this.setUsername(user.getUsername());
	}

	@Override
	public Set<Authority> getAuthorities() {
		// TODO Auto-generated method stub
		return super.getAuthorities();
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return super.getPassword(); //from parent obj
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return super.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {//whether out user is an active user 
		//if they have cancelled their subscription
		//if false they r not allowed to login meaning no authorization
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		//when they have entered they password wrong many times
		//or they havent paid their bill
		//if false they r not allowed to login

		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	
	
}
