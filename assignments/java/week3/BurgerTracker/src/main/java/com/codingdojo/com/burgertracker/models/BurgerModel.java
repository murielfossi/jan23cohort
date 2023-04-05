package com.codingdojo.com.burgertracker.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="burgers")

public class BurgerModel {
	
    // ==========================
    //        ATTRIBUTES
    // ==========================
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	
    @NotBlank(message="this field is required")
    private String burgerName;
    

	@NotBlank(message="this field is required")
	private String restaurantName;
    
	@NotNull
	@Min(value = 0, message="rating cannot be less than 0")
	@Max(value= 5, message="rating cannot be greater than 5")
	private Integer rating;
	

	@NotBlank(message="this field is required")
	private String notes;
   
    
    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
	
	
	    // ==========================
       //        CONSTRUCTOR
      // ==========================
    
	
	/**
	 * @param burgerName
	 * @param restaurantName
	 * @param rating
	 * @param notes
	 */
    
    public BurgerModel() {}
    
    
    
	public BurgerModel(@NotBlank(message = "this field is required") String burgerName,
			@NotBlank(message = "this field is required") String restaurantName,
			@NotNull @Min(value = 0, message = "rating cannot be less than 0") @Max(value = 5, message = "rating cannot be greater than 5") Integer rating,
			@NotBlank(message = "this field is required") String notes) 
	{
		super();
		this.burgerName = burgerName;
		this.restaurantName = restaurantName;
		this.rating = rating;
		this.notes = notes;
	}
	
	
	
	
	@PrePersist
    protected void onCreate()
	{
        this.createdAt = new Date();
    }
    
	@PreUpdate
    protected void onUpdate()
	{
        this.updatedAt = new Date();
    }
	

    // ==========================
    //     GETTERS / SETTERS
    // ==========================

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getBurgerName() {
		return burgerName;
	}



	public void setBurgerName(String burgerName) {
		this.burgerName = burgerName;
	}



	public String getRestaurantName() {
		return restaurantName;
	}



	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}



	public Integer getRating() {
		return rating;
	}



	public void setRating(Integer rating) {
		this.rating = rating;
	}



	public String getNotes() {
		return notes;
	}



	public void setNotes(String notes) {
		this.notes = notes;
	}



	public Date getCreatedAt() {
		return createdAt;
	}



	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}



	public Date getUpdatedAt() {
		return updatedAt;
	}



	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
    // ==========================
    //     GETTERS / SETTERS
    // ==========================
	
	
	
	
	
	
	
	
}
