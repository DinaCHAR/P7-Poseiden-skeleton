package com.nnk.springboot.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;

@Entity
@Table(name = "rating")
public class Rating {
	// TODO: Map columns in data table RATING with corresponding java fields OK
	    @Id
	    @GeneratedValue(strategy= GenerationType.AUTO)
	    private Integer id;
	    @Column(name = "moodys_rating")
	    private String moodysRating;
	    @Column(name = "sand_rating")
	    private String sandRating;
	    @Column(name = "fitch_rating")
	    private String fitchRating;
	    @Column(name = "order_number")
	    @Min(value = 0, message = "must be greater than or equal to 0")
	    private Integer orderNumber;
	
	    public Rating(String moodysRating, String sandRating, String fitchRating, Integer orderNumber) {
	        this.moodysRating = moodysRating;
	        this.sandRating = sandRating;
	        this.fitchRating = fitchRating;
	        this.orderNumber = orderNumber;
	    }
	
	    public Rating() {
	
	    }
	
	
	    public Integer getOrderNumber() {
	        return orderNumber;
	    }
	
	    public void setOrderNumber(Integer orderNumber) {
	        this.orderNumber = orderNumber;
	    }
	
	    public String getFitchRating() {
	        return fitchRating;
	    }
	
	    public void setFitchRating(String fitchRating) {
	        this.fitchRating = fitchRating;
	    }
	
	    public String getSandRating() {
	        return sandRating;
	    }
	
	    public void setSandRating(String sandRating) {
	        this.sandRating = sandRating;
	    }
	
	    public String getMoodysRating() {
	        return moodysRating;
	    }
	
	    public void setMoodysRating(String moodysRating) {
	        this.moodysRating = moodysRating;
	    }
	
	    public Integer getId() {
	        return id;
	    }
	
	    public void setId(Integer id) {
	        this.id = id;
	    }
}