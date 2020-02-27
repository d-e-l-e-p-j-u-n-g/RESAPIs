package com.passenger.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.passenger.dtos.FlightDto;
import com.passenger.services.FlightService;

@RestController
@RequestMapping("/flights")
public class FlightController {
	
	private FlightService flightserv;
	
	@GetMapping(value ="")
	public FlightDto getFlightByNumber() {
		return flightserv.getDummyFlight();
	}
	
	@GetMapping("/{flightnum}")
	public FlightDto getFlightByFlightNumber(@PathVariable(value="flightnum") String flightnumber) {
		return flightserv.getDummyFlightPath(flightnumber);
	}

	public FlightService getFlightserv() {
		return flightserv;
	}

	public void setFlightserv(FlightService flightserv) {
		this.flightserv = flightserv;
	}

	
	
	

}
