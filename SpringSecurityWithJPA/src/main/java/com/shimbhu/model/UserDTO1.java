package com.shimbhu.model;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.shimbhu.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO1 {
	
   // @NotBlank(message = "Enter your first name ")
    @Pattern(regexp = "^[a-zA-Z0-9]{3,12}$",
    message = "username must be of 3 to 12 length with no special characters")
	private String firstName;
    
  //  @NotBlank(message = "Enter your last name ")
    @Pattern(regexp = "^[a-zA-Z0-9]{3,12}$",
    message = "username must be of 3 to 12 length with no special characters")
	private String lastName;
	
	
	
	@Pattern(regexp = "^((?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9])).{6,12}$",
            message = "password must contain atleast 1 uppercase, 1 lowercase, 1 special character and 1 digit ")
	@NotBlank
	@Size(min = 6,max = 12,message = "password should have 6 to  12  characters")
	private String passWord;
}
