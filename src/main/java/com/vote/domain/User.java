package com.vote.domain;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.vote.security.Authority;

@Entity
@Table(name="users")
public class User {

	private Long m_id;
	private String m_username;
	private String m_password;
	private String m_name;
	private Set<Authority> m_authorities=new HashSet<>();

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return m_id;
	}
	public void setId(Long m_id) {
		this.m_id = m_id;
	}
	public String getUsername() {
		return m_username;
	}
	public void setUsername(String m_username) {
		this.m_username = m_username;
	}
	public String getPassword() {
		return m_password;
	}
	public void setPassword(String m_password) {
		this.m_password = m_password;
	}
	public String getName() {
		return m_name;
	}
	public void setName(String m_name) {
		this.m_name = m_name;
	}
	
	//from the user to authority is one to many
	//from authority to user is many to one
	//if we delete user we should delete all the roles associated to it
	//whenever u load the user u should have authority anyway
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "user")
	public Set<Authority> getAuthorities() {
		return m_authorities;
	}
	public void setAuthorities(Set<Authority> m_authorities) {
		this.m_authorities = m_authorities;
	}
	
	
	
}
