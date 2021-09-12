package com.vote.domain;

import javax.persistence.Entity;

@Entity
@Table(name="users")
public class User {

	private Long m_id;
	private String m_username;
	private String m_password;
	private String m_name;
	
	
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
	
	
	
}
