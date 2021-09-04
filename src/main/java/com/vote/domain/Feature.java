package com.vote.domain;

import javax.persistence.Entity;
import javax.persistence.GenerationType;

@Entity
public class Feature {

	private Long m_id;
	private String m_title;
	private String m_description;
	private String m_status;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getM_id() {
		return m_id;
	}
	public void setM_id(Long m_id) {
		this.m_id = m_id;
	}
	public String getM_title() {
		return m_title;
	}
	public void setM_title(String m_title) {
		this.m_title = m_title;
	}
	public String getM_description() {
		return m_description;
	}
	public void setM_description(String m_description) {
		this.m_description = m_description;
	}
	public String getM_status() {
		return m_status;
	}
	public void setM_status(String m_status) {
		this.m_status = m_status;
	}
	
	
	
}
