package com.passenger.dtos;

import java.io.Serializable;
import java.util.List;

public class FlightDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String flightNumber;
	private String source;
	private String destination;
	
	private List<PassengerDto> passengerlist;

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public List<PassengerDto> getPassengerlist() {
		return passengerlist;
	}

	public void setPassengerlist(List<PassengerDto> passengerlist) {
		this.passengerlist = passengerlist;
	}
	
	

}
