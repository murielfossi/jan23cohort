package com.codingdojo.com.bookclub.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="books")
public class BookModel {

	// ==========================
    //        ATTRIBUTES
    // ==========================
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	
    @NotBlank(message="this field is required")
    private String title;
    
    
    @NotBlank(message="Author is required!")
    @Size(min=3, max=30, message="Author must be between 3 and 30 characters")
	private String author;
    

	@NotBlank
	private String thoughts;
	
 // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
	
	
    // ==========================
    //        RELATIONSHIPS
    // ==========================
	
	
    @ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")//foreign key
	private UserModel user;
	
	
    // ==========================
    //        CONSTRUCTOR
    // ==========================
	
    public BookModel() {}


	/**
	 * @param title
	 * @param author
	 * @param thoughts
	 * @param user
	 */
	public BookModel(@NotBlank(message = "this field is required") String title,
			@NotBlank(message = "Author is required!") @Size(min = 3, max = 30, message = "Author must be between 3 and 30 characters") String author,
			@NotBlank String thoughts, UserModel user) {
		super();
		this.title = title;
		this.author = author;
		this.thoughts = thoughts;
		this.user = user;
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


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getThoughts() {
		return thoughts;
	}


	public void setThoughts(String thoughts) {
		this.thoughts = thoughts;
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


	public UserModel getUser() {
		return user;
	}


	public void setUser(UserModel user) {
		this.user = user;
	}

    
    
	
}
