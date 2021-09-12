package com.vote.domain;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class VoteId {

	private User m_user;
	private Feature m_Feature;
	
	@ManyToOne
	public User getM_user() {
		return m_user;
	}
	public void setM_user(User m_user) {
		this.m_user = m_user;
	}
	public Feature getM_Feature() {
		return m_Feature;
	}
	public void setM_Feature(Feature m_Feature) {
		this.m_Feature = m_Feature;
	}
}
