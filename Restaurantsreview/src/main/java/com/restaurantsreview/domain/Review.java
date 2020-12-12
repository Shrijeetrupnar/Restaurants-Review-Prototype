package com.restaurantsreview.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Review {
	
	
	
	private ReviewId pk;
	public String reviewText;

	@Column(length =5000)
	public String getReviewText() {
		return reviewText;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	@EmbeddedId
	public ReviewId getPk() {
		return pk;
	}

	public void setPk(ReviewId pk) {
		this.pk = pk;
	}


	

}
