package Practice_Problem;

import org.junit.Test;

public class TestHotelReservatioSystem {
//	Find cheapest hotel =>	
	@Test
	public void testDateRange() {
		HotelReservationSystem hotelRoom = new HotelReservationSystem();
		String input = "Regular: 10Sep2020(thu), 11Sep2020(fri)";
		String hotel = hotelRoom.minCostHotel(input);
		equals(hotel != null);
	}
//	Ability to find the cheapest Hotel based on weekday and weekend =>	
	@Test
	public void testCheapestHotel() {
		HotelReservationSystem hotelRoom = new HotelReservationSystem();
		String input = "Regular: 11Sep2020(fri), 12Sep2020(sat)";
		String hotel = hotelRoom.minCostHotel(input);
		equals(hotel != null);
	}

}
