package com.passenger.services;

import java.util.ArrayList;
import java.util.List;

import com.passenger.dtos.FlightDto;
import com.passenger.dtos.PassengerDto;

public class FlightService {

	public FlightDto getDummyFlight() {
		FlightDto fd = new FlightDto();
		fd.setFlightNumber("SA2265");
		fd.setSource("IAD");
		fd.setDestination("MCI");

		List<PassengerDto> passengerlist = new ArrayList<PassengerDto>();

		PassengerDto dto = new PassengerDto();
		dto.setFullName("Delep Jung");
		dto.setGender("Male");
		dto.setPhone("4435678907");
		dto.setEmail("abcd@hardmail.com");

		PassengerDto dto1 = new PassengerDto();
		dto1.setFullName("Yadav Banstola");
		dto1.setGender("Male");
		dto1.setPhone("4435676767");
		dto1.setEmail("abd@hardmail.com");

		PassengerDto dto2 = new PassengerDto();
		dto2.setFullName("Vishal Kc");
		dto2.setGender("Male");
		dto2.setPhone("4436789090");
		dto2.setEmail("abc@hardmail.com");

		PassengerDto dto3 = new PassengerDto();
		dto3.setFullName("Aroma Khadka");
		dto3.setGender("Female");
		dto3.setPhone("4435675643");
		dto3.setEmail("ab@hardmail.com");

		passengerlist.add(dto);
		passengerlist.add(dto1);
		passengerlist.add(dto2);
		passengerlist.add(dto3);

		fd.setPassengerlist(passengerlist);

		return fd;

	}
	
	public FlightDto getDummyFlightPath(String flightnum) {
		FlightDto fd = new FlightDto();
		fd.setFlightNumber("SA2265");
		fd.setSource("IAD");
		fd.setDestination("MCI");

		List<PassengerDto> passengerlist = new ArrayList<PassengerDto>();

		PassengerDto dto = new PassengerDto();
		dto.setFullName("Delep Jung");
		dto.setGender("Male");
		dto.setPhone("4435678907");
		dto.setEmail("abcd@hardmail.com");

		PassengerDto dto1 = new PassengerDto();
		dto1.setFullName("Yadav Banstola");
		dto1.setGender("Male");
		dto1.setPhone("4435676767");
		dto1.setEmail("abd@hardmail.com");

		PassengerDto dto2 = new PassengerDto();
		dto2.setFullName("Vishal Kc");
		dto2.setGender("Male");
		dto2.setPhone("4436789090");
		dto2.setEmail("abc@hardmail.com");

		PassengerDto dto3 = new PassengerDto();
		dto3.setFullName("Aroma Khadka");
		dto3.setGender("Female");
		dto3.setPhone("4435675643");
		dto3.setEmail("ab@hardmail.com");

		passengerlist.add(dto);
		passengerlist.add(dto1);
		passengerlist.add(dto2);
		passengerlist.add(dto3);

		fd.setPassengerlist(passengerlist);

		return fd;

	}

}
