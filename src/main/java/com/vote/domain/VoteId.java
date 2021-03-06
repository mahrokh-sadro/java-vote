package com.vote.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class VoteId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1438986719382278224L;
	private User m_user;
	private Feature m_feature;
	
	@ManyToOne
	public User getUser() {
		return m_user;
	}
	public void setUser(User m_user) {
		this.m_user = m_user;
	}
	
	@ManyToOne
	public Feature getFeature() {
		return m_feature;
	}
	public void setFeature(Feature m_Feature) {
		this.m_feature = m_Feature;
	}
}
