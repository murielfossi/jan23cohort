package com.codingdojo.com.savetravels.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="expenses")

public class SaveTravelModel {

	// ==========================
    //        ATTRIBUTES
    // ==========================
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	
    @NotBlank(message="this field is required")
    private String expenseName;
    

	@NotBlank(message="this field is required")
	private String vendor;
    
	@NotNull
	@Min(value = 0, message="rating cannot be less than 0")
	private double amount;
	

	@NotBlank(message="this field is required")
	private String description;
   
    
    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    
	
    // ==========================
   //        CONSTRUCTOR
  // ==========================
    
    
    public SaveTravelModel() {}

    
	/**
	 * @param expenseName
	 * @param vendor
	 * @param amount
	 * @param description
	 */
	public SaveTravelModel(@NotBlank(message = "this field is required") String expenseName,
			@NotBlank(message = "this field is required") String vendor,
			@NotNull @Min(value = 0, message = "rating cannot be less than 0") double amount,
			@NotBlank(message = "this field is required") String description) {
		super();
		this.expenseName = expenseName;
		this.vendor = vendor;
		this.amount = amount;
		this.description = description;
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


	public String getExpenseName() {
		return expenseName;
	}


	public void setExpenseName(String expenseName) {
		this.expenseName = expenseName;
	}


	public String getVendor() {
		return vendor;
	}


	public void setVendor(String vendor) {
		this.vendor = vendor;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
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
	
	
	
	
    
    
    
    
    
    
    
    
	
}
