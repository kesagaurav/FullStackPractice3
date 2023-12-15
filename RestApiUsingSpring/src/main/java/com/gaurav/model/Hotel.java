package com.gaurav.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int hid;
	@NotNull(message = "foodname is not in format")// -> {hotel.foodName.absent}
	@Pattern(regexp = "[a-z]{1,}"  ,message = "{hotel.foodName.invalid}")
	private String foodName;
	@NotNull(message = "family is needed")
	//@Pattern(regexp = "[0-9]{1,}"  ,message = "hotel.family.invalid")
	private int family;
	@NotNull(message = "plz enter amount")
	private double amount;
	@NotNull(message = "rating is not in specified range")
	@Max(value=5,message="{hotel.rating.invalid}")
	private int rating;
	
	
}
