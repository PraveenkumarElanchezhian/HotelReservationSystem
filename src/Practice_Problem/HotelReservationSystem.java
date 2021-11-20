package Practice_Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class HotelReservationSystem {

	ArrayList<Hotel> HotelList = new ArrayList<Hotel>();

	public List<Hotel> hotelBooking(String hotelName, int rating, int weekendPrice, int weekdayPrice,
			boolean isRegularCustomer, boolean isrewardsCustomer) {

		Hotel rv = new Hotel();
		rv.setHotelName(hotelName);
		rv.setRating(rating);
		rv.setRegularCustomer(isRegularCustomer);
		rv.setIsrewardsCustomer(isrewardsCustomer);
		rv.setWeekdayPrice(weekdayPrice);
		rv.setWeekendPrice(weekendPrice);
		HotelList.add(rv);
		return HotelList;
	}

	public Hotel dateRange(ArrayList<Hotel> hotel_List) {
		Hotel dateRangeHotel = hotel_List.stream().collect(Collectors.maxBy(Comparator.comparingInt(Hotel::getWeekdayPrice))).get();
		return dateRangeHotel;
	}
	public static void main(String[] args) {
	}
}
