package com.restaurantsreview.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Review {
	

	
//	private ReviewId pk;
	public Long reviewID;
	public Long restaurantId;
	public Long userId;
	
	public String reviewText;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getReviewID() {
		return reviewID;
	}

	public void setReviewID(Long reviewID) {
		this.reviewID = reviewID;
	}

	public Long getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}



	@Column(length =5000)
	public String getReviewText() {
		return reviewText;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

//	@EmbeddedId
//	public ReviewId getPk() {
//		return pk;
//	}
//
//	public void setPk(ReviewId pk) {
//		this.pk = pk;
//	}


	

}
