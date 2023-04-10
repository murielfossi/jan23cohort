package com.codingdojo.com.dojoninjas.Models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="dojos")

public class DojoModel {
	
    // ==========================
    //        ATTRIBUTES
    // ==========================
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	
    @NotBlank(message="this field is required")
    private String dojoName;
    

	
   
    
    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
	
    
    
    
    // ==========================
    //        RELATIONSHIPS
    // ==========================
    
	@OneToMany(mappedBy="dojo", fetch = FetchType.LAZY)
	private List<NinjaModel> ninjas;


    // ==========================
   //        CONSTRUCTOR
   // ==========================
	

	public DojoModel() {}
    

	/**
	 * @param dojoName
	 * @param ninjas
	 */
	public DojoModel(@NotBlank(message = "this field is required") String dojoName, List<NinjaModel> ninjas) {
		super();
		this.dojoName = dojoName;
		this.ninjas = ninjas;
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


	public String getDojoName() {
		return dojoName;
	}


	public void setDojoName(String dojoName) {
		this.dojoName = dojoName;
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


	public List<NinjaModel> getNinjas() {
		return ninjas;
	}


	public void setNinjas(List<NinjaModel> ninjas) {
		this.ninjas = ninjas;
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
