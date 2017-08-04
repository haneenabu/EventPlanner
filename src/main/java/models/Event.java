package models;

import java.util.HashMap;
import java.util.Map;

public class Event {
    private int totalCost =0;
    Map<Integer, Integer> foodCost = new HashMap<Integer, Integer>();
    Map<Integer, Integer> drinksCost = new HashMap<Integer, Integer>();
    Map<Integer, Integer> entertainmentCost = new HashMap<Integer, Integer>();

    public int planner (int numGuests){

        return numGuests;
    }
    public int costOfGuest (int numGuests){
        int costOfGuests = numGuests *12;
        return costOfGuests;
    }
    public int calculateFoodCost(int foodChoice) {
        foodCost.put(1, 500);
        foodCost.put(2, 550);
        foodCost.put(3, 600);
        foodCost.put(4, 575);
        foodCost.put(5, 650);
        return 1;
    }
    public int calculateDrinksCost(int drinkChoice){
        drinksCost.put(1, 260);
        drinksCost.put(2, 300);
        drinksCost.put(3, 320);
        drinksCost.put(4, 200);
        drinksCost.put(5, 350);

        return 1;
    }
    public int calculateEntertainmentCost(int drinkChoice){
        return 1;
    }
}
