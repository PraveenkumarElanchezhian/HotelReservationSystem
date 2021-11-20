package Practice_Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

	public static void main(String[] args) {
	}
}
