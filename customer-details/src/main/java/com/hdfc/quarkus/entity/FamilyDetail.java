package com.hdfc.quarkus.entity;

import com.hdfc.quarkus.enums.MaritalStatus;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class FamilyDetail extends PanacheEntity{
	
	@Enumerated(EnumType.STRING)
	private MaritalStatus maritalStatus;
	private String spouseName;
	private int numberOfDependents;

}
