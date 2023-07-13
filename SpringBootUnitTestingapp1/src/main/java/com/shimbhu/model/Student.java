package com.shimbhu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer roll;
	
	@Size(min = 3, max = 20, message = "Name Length should be min 3 and max 20")
	@NotNull(message = "name is mandatory")
	private String name;
	
	@NotNull(message = "Address is mandatory")
	private String address;
	
	@NotNull(message = "marks is mandatory")
	@Min(value = 0, message = "marks should be minimum 0")
	@Max(value = 100, message = "marks should be maximum 100")
	private Integer marks;
}
