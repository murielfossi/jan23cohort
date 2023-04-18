package com.codingdojo.com.ProjectManager.models;

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
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="courses")
public class CourseModel {


	

		// ==========================
	    //        ATTRIBUTES
	    // ==========================
		
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
		
		
	    @NotBlank(message="this field is required")
	    private String coursename;
	    
	    
	    @NotEmpty(message="this field is required")
	    
		private String gender;
	    

		@NotBlank(message="this field is required")
		
		private String origin;
		
		
		@NotBlank
		@Size(min=4, max=50, message="Meaning must be between 4 and 50 characters")
		private String meaning;
		
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
		
	    public CourseModel() {}


		/**
		 * @param coursename
		 * @param gender
		 * @param origin
		 * @param meaning
		 * @param user
		 */
		public CourseModel(@NotBlank(message = "this field is required") String coursename,
				@NotBlank(message = "Gender is required!") String gender, @NotBlank String origin,
				@NotBlank @Size(min = 4, max = 50, message = "Meaning must be between 4 and 50 characters") String meaning,
				UserModel user) {
			super();
			this.coursename = coursename;
			this.gender = gender;
			this.origin = origin;
			this.meaning = meaning;
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


		public String getCoursename() {
			return coursename;
		}


		public void setCoursename(String coursename) {
			this.coursename = coursename;
		}


		public String getGender() {
			return gender;
		}


		public void setGender(String gender) {
			this.gender = gender;
		}


		public String getOrigin() {
			return origin;
		}


		public void setOrigin(String origin) {
			this.origin = origin;
		}


		public String getMeaning() {
			return meaning;
		}


		public void setMeaning(String meaning) {
			this.meaning = meaning;
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
