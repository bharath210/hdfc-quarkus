package com.hdfc.banking.vo;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerVO {
	
	private long id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String email;

}
