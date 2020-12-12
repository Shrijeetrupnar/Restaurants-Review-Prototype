package com.restaurantsreview.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Rating {
	
	
	private RatingId pk;
	private float rating;
	
	@EmbeddedId
	public RatingId getPk() {
		return pk;
	}
	public void setPk(RatingId pk) {
		this.pk = pk;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	
	
	

}
