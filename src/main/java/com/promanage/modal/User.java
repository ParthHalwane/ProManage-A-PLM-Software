package com.promanage.modal;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long id;
	
	private String fullName;
	private String email;
	private String password;
	
	@JsonIgnore
	@OneToMany(mappedBy="assignee", cascade=CascadeType.ALL)
	private List<Issue>assignedIssues=new ArrayList<>();
	
	private int projectSize;

	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	public String getFullName() {
		// TODO Auto-generated method stub
		return fullName;
	}

	public void setFullName(String fullName2) {
		// TODO Auto-generated method stub
		this.fullName=fullName2;
		
	}

	public void setEmail(String email2) {
		// TODO Auto-generated method stub
		this.email=email2;
		
	}

	public void setPassword(String encode) {
		// TODO Auto-generated method stub
		this.password=encode;
		
	}
}
