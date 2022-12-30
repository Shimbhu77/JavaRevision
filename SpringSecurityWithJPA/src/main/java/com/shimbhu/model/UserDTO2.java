package com.shimbhu.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO2 {

	
    private String name;
	
	@Pattern(regexp = "^((?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9])).{6,12}$",
  message = "password must contain atleast 1 uppercase, 1 lowercase, 1 special character and 1 digit ")
	
	@NotBlank
	@Size(min = 6,max = 12,message = "password should have 6 to  12  characters")
	private String passWord;
}
