package com.wipro.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;

/*@Setter  // setter function of all variables
@Getter  // getter function of all variables
@NoArgsConstructor   // Default constructor,ie having no arguments
*/

@Data  // it contains setter,getter functions and default constructor
@AllArgsConstructor  // parameterized constructor with all arguments
public class Customer {
		
	private int id;
	private String name;
	private String email;

}
