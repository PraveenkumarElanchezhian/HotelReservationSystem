package Practice_Problem;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestHotelReservatioSystem {
	@Test
	public void testHotelBooking() {
		HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
		hotelReservationSystem.hotelBooking("Lakewood", 3, 90, 110, true, true);
		hotelReservationSystem.hotelBooking("Bridgewood", 4, 60, 160, true, true);
		List<Hotel> highRateHotel = hotelReservationSystem.hotelBooking("Ridgewood", 5, 150, 220, true, true);
// 	Lakewood Hotel =>	
		assertEquals("Lakewood", highRateHotel.get(0).getHotelName());
		assertEquals(3, highRateHotel.get(0).getRating());
		assertEquals(110, highRateHotel.get(0).getWeekdayPrice());
		assertEquals(90, highRateHotel.get(0).getWeekendPrice());
//	 Bridgewood Hotel =>
		assertEquals("Bridgewood", highRateHotel.get(1).getHotelName());
		assertEquals(4, highRateHotel.get(1).getRating());
		assertEquals(160, highRateHotel.get(1).getWeekdayPrice());
		assertEquals(60, highRateHotel.get(1).getWeekendPrice());
//	 Ridgewood Hotel =>		
		assertEquals("Ridgewood", highRateHotel.get(2).getHotelName());
		assertEquals(5, highRateHotel.get(2).getRating());
		assertEquals(220, highRateHotel.get(2).getWeekdayPrice());
		assertEquals(150, highRateHotel.get(2).getWeekendPrice());
	}
// Find cheapest hotel =>	
	@Test
	public void testDateRange() {
		HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
		hotelReservationSystem.hotelBooking("Lakewood", 3, 90, 110, true, true);
		hotelReservationSystem.hotelBooking("Bridgewood", 4, 60, 160, true, true);
		List<Hotel> highRateHotel = hotelReservationSystem.hotelBooking("Ridgewood", 5, 150, 220, true, true);
		Hotel hotel_List = hotelReservationSystem.dateRange((ArrayList<Hotel>) highRateHotel);
		assertEquals("Lakewood",hotel_List.getHotelName());
	}
}
