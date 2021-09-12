package com.vote.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feature {

	private Long m_id;
	private String m_title;
	private String m_description;
	private String m_status;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return m_id;
	}
	public void setId(Long m_id) {
		this.m_id = m_id;
	}
	public String getTitle() {
		return m_title;
	}
	public void setTitle(String m_title) {
		this.m_title = m_title;
	}
	public String getDescription() {
		return m_description;
	}
	public void setDescription(String m_description) {
		this.m_description = m_description;
	}
	public String getStatus() {
		return m_status;
	}
	public void setStatus(String m_status) {
		this.m_status = m_status;
	}
	
	
	
}
