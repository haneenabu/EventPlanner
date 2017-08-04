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
        return 1;
    }
    public int calculateDrinksCost(int drinkChoice){
        return 1;
    }
    public int calculateEntertainmentCost(int drinkChoice){
        return 1;
    }
}
