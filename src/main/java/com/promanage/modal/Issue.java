package com.promanage.modal;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Issue {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idLong;
	
	@ManyToOne
	private User assignee;
}
