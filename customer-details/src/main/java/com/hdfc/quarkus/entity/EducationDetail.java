package com.hdfc.quarkus.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class EducationDetail extends PanacheEntity{
	
	private String degree;
	private String institute;
	private int yearCompleted;
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;

}
