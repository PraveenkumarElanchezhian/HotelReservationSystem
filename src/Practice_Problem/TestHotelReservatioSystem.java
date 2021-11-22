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

}
