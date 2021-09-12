package com.vote.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Comment {

	private CommentId m_pk;
	private String m_text;
	@EmbeddedId
	public CommentId getPk() {
		return m_pk;
	}
	public void setPk(CommentId m_pk) {
		this.m_pk = m_pk;
	}
	@Column(length = 5000)
	public String getText() {
		return m_text;
	}
	public void setText(String m_text) {
		this.m_text = m_text;
	}
}
