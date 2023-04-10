package com.codingdojo.com.dojoninjas.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="ninjas")
public class NinjaModel {

	
	
    // ==========================
    //        ATTRIBUTES
    // ==========================
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	
    @NotBlank(message="this field is required")
    private String firstName;
    

	@NotBlank(message="this field is required")
	private String lastName;
    
	@NotNull
	@Min(value = 0, message="rating cannot be less than 0")
	
	private Integer age;
	
   
    
    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    
    
    
 // ==========================
 //        RELATIONSHIPS
 // ==========================
    
    @ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="dojo_id")
	private DojoModel dojo;


  
   // ==========================
  //        CONSTRUCTOR
  // ==========================
    
    

	public NinjaModel() {}

/**
 * @param firstName
 * @param lastName
 * @param age
 * @param dojo
 */
public NinjaModel(@NotBlank(message = "this field is required") String firstName,
		@NotBlank(message = "this field is required") String lastName,
		@NotNull @Min(value = 0, message = "rating cannot be less than 0") Integer age, DojoModel dojo) {

	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
	this.dojo = dojo;
}
    
    



//==========================
//GETTERS / SETTERS
//=========================



public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public Integer getAge() {
	return age;
}

public void setAge(Integer age) {
	this.age = age;
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

public DojoModel getDojo() {
	return dojo;
}

public void setDojo(DojoModel dojo) {
	this.dojo = dojo;
}



    
//=============prepersist=========
//===================     ========

@PrePersist
protected void onCreate()
{
  this.createdAt = new Date();
}

@PreUpdate
protected void onUpdate()
{
  this.updatedAt = new Date();}

    
    
    
    
    
    
    
    
    
    
    
    
	
}
