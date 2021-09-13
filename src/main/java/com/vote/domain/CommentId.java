package com.vote.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class CommentId implements Serializable{

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
	public void setFeature(Feature m_feature) {
		this.m_feature = m_feature;
	}
}
