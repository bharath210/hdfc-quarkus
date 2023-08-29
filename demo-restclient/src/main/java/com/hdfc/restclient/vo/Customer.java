package com.hdfc.restclient.vo;

import java.time.LocalDate;

import jakarta.json.bind.annotation.JsonbProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {
	
	private long id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String email;

}
