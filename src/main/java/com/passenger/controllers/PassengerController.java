package com.passenger.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.passenger.dtos.PassengerDto;

@RestController
@RequestMapping("/passenger")
public class PassengerController {
	@GetMapping("")
	public PassengerDto getDummyPassenger() {
		
	  PassengerDto dto = new PassengerDto();
	  dto.setFullName("Delep Jung");
	  dto.setGender("Male");
	  dto.setPhone("4435678907");
	  dto.setEmail("abcd@hardmail.com");
	  
	  return dto;
	}
	
	@PostMapping("")
	public void createDummyPassenger(@RequestBody PassengerDto dd) {
		System.out.println(dd.toString());
	}
	

}
