package com.Medskyline.Entity;

 import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;
    
    @Column(nullable = false, unique = true)
    private String email;
    
    @Column(nullable = false, unique = true)
    private String mobile;
    
    @Column(name = "user_type", nullable = false)
    private String userType;
    
    private String status;

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setName(Object name2) {
		// TODO Auto-generated method stub
		
	}

	public Object getDateOfBirth() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDateOfBirth(Object dateOfBirth2) {
		// TODO Auto-generated method stub
		
	}

	public Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setEmail(Object email2) {
		// TODO Auto-generated method stub
		
	}

	public Object getMobile() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setMobile(Object mobile2) {
		// TODO Auto-generated method stub
		
	}

	public Object getUserType() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setUserType(Object userType2) {
		// TODO Auto-generated method stub
		
	}

	public void setStatus(String string) {
		// TODO Auto-generated method stub
		
	}
    
    // Constructors, getters, and setters
}
