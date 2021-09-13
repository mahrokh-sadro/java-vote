package com.vote.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity

public class Vote {

	private VoteId m_pk;
	private Boolean m_upvote;

	public Boolean getUpvote() {
		return m_upvote;
	}

	public void setUpvote(Boolean upvote) {
		this.m_upvote = upvote;
	}
	
	@EmbeddedId
	  public VoteId getPk()
	  {
	    return m_pk;
	  }

	  public void setPk(VoteId pk)
	  {
	    this.m_pk = pk;
	  }
}
