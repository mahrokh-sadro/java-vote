package com.vote.security;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.security.core.GrantedAuthority;

import com.vote.domain.User;


@Entity
public class Authority implements GrantedAuthority{

	
	
	private static final long serialVersionUID = 4657678865709109193L;

	private Long m_id; //its an entity so it needs id
	private String m_authority;//roles
    private User user;
	
	
	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return m_authority;
	}
	
	public void setAuthority(String authority) {
		this.m_authority = authority;
	}

	  @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return m_id;
	}

	public void setId(Long m_id) {
		this.m_id = m_id;
	}

	@ManyToOne
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	
}
