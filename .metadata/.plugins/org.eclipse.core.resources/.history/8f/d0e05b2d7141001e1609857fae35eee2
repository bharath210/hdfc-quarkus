package com.hdfc.quarkus.entity;

import java.time.LocalDate;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Customer extends PanacheEntity{
	
	private long custId;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String email;
	private Address address;
	private Customer customer;
	private ProfessionalDetail professionalDetail;
	private EducationDetail educationDetail;
	private Account account;
	
}
