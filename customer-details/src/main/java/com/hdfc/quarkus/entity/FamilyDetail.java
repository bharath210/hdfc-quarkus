package com.hdfc.quarkus.entity;

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
public class FamilyDetail extends PanacheEntity{
	
	private String maritalStatus;
	private String spouseName;
	private int numberOfDependents;

}
