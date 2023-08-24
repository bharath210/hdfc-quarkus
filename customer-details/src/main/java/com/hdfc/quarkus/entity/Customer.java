package com.hdfc.quarkus.entity;

import java.time.LocalDate;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
	

	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", nullable = false)
	private Address address;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "professionalDetail_id", nullable = false)
	private ProfessionalDetail professionalDetail;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "familyDetail_id", nullable = false)
	private FamilyDetail familyDetail;
	
}
