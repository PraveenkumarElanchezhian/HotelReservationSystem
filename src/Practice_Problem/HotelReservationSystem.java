package Practice_Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class HotelReservationSystem {

	private HashMap<String, List<Integer>> lakeWood = new HashMap<>();
	private HashMap<String, List<Integer>> bridgeWood = new HashMap<>();
	private HashMap<String, List<Integer>> ridgeWood = new HashMap<>();	
// Rating of each Hotel	
	private static int lakeWoodRating;
	private static int bridgeWoodRating;
	private static int rigdeWoodRating;

	public HotelReservationSystem() {
		setLakeWood();
		setBridgeWood();
		setRidgeWood();
	}

	private void setLakeWood() {
		lakeWoodRating = 3;
		List<Integer> RewardsCustomer = new ArrayList<>();
		RewardsCustomer.add(80);
		lakeWood.put("Rewards", RewardsCustomer);
		List<Integer> RegularCustomer = new ArrayList<>();
		RegularCustomer.add(110);
		RegularCustomer.add(90);
		lakeWood.put("Regular", RegularCustomer);
	}

	private void setBridgeWood() {
		bridgeWoodRating = 4;
		List<Integer> RewardsCustomer = new ArrayList<>();
		RewardsCustomer.add(110);
		RewardsCustomer.add(50);
		bridgeWood.put("Rewards", RewardsCustomer);
		List<Integer> RegularCustomer = new ArrayList<>();
		RegularCustomer.add(160);
		RegularCustomer.add(60);
		bridgeWood.put("Regular", RegularCustomer);
	}

	private void setRidgeWood() {
		rigdeWoodRating = 5;
		List<Integer> RewardsCustomer = new ArrayList<>();
		RewardsCustomer.add(100);
		RewardsCustomer.add(40);
		ridgeWood.put("Rewards", RewardsCustomer);
		List<Integer> RegularCustomer = new ArrayList<>();
		RegularCustomer.add(220);
		RegularCustomer.add(150);
		ridgeWood.put("Regular", RegularCustomer);
	}

	public String maxCostHotel(String input) {
		String[] arr = input.split(",");
		String customerType = "";
		if (arr.length > 0) {
			String tempArr[] = arr[0].split(":");
			customerType = tempArr[0];
			arr[0] = tempArr[1];
		}
		String hotel = maxCostHotel(customerType, arr);
		return hotel;
	}

	private String maxCostHotel(String customerType, String[] arr) {
		int numOfWeekdays = 0;
		int numOfWeekends = 0;
		int lakeWoodCost = 0;
		int bridgeWoodCost = 0;
		int ridgeWoodCost = 0;
		for (int i = 0; i < arr.length; i++) {
			String day = arr[i];
			if (day.contains("mon") || day.contains("tue") || day.contains("wed") || day.contains("thu")
					|| day.contains("fri")) {
				numOfWeekdays++;
			} else {
				numOfWeekends++;
			}
		}
		List<Integer> valuesForLakewood = lakeWood.get(customerType); // 0 - weekday, 1- weekend
		List<Integer> valuesForBridgeWood = bridgeWood.get(customerType);
		List<Integer> valuesForRidgeWood = ridgeWood.get(customerType);
		lakeWoodCost = numOfWeekdays * valuesForLakewood.get(0) + numOfWeekends * valuesForLakewood.get(1);
		bridgeWoodCost = numOfWeekdays * valuesForBridgeWood.get(0) + numOfWeekends * valuesForBridgeWood.get(1);
		ridgeWoodCost = numOfWeekdays * valuesForRidgeWood.get(0) + numOfWeekends * valuesForRidgeWood.get(1);
		String hotel = maxCost(lakeWoodCost, bridgeWoodCost, ridgeWoodCost);
		return hotel;
	}

	private String maxCost(int lakeWoodCost, int bridgeWoodCost, int ridgeWoodCost) {
		int maxCost = Math.max(ridgeWoodCost, Math.max(bridgeWoodCost, lakeWoodCost));
		if (maxCost == ridgeWoodCost && maxCost == bridgeWoodCost) {
			return bridgeWoodRating > ridgeWoodCost ? "BridgeWood" : "ridgeWood";
		} else if (maxCost == bridgeWoodCost && maxCost == lakeWoodCost) {
			return bridgeWoodRating > lakeWoodCost ? "BridgeWood" : "lakeWood";
		} else if (maxCost == ridgeWoodCost && maxCost == lakeWoodCost) {
			return ridgeWoodCost > lakeWoodCost ? "RidgeWood" :"LakeWood" ;
		} else {
			if (maxCost == ridgeWoodCost) {
				return "RidgeWood";
			} else if (maxCost == bridgeWoodCost) {
				return "BridgeWood";
			} else {
				return "LakeWood";
			}
		}
	}

	public static void main(String[] args) {
	}
}
