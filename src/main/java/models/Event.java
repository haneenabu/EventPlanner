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
    public int calculateFoodCost(Integer foodChoice) {
        foodCost.put(1, 500);
        foodCost.put(2, 550);
        foodCost.put(3, 600);
        foodCost.put(4, 575);
        foodCost.put(5, 650);
        if(foodChoice.equals(1) || foodChoice.equals(2) || foodChoice.equals(3) || foodChoice.equals(4) || foodChoice.equals(5)) {
            int foodValue = foodCost.get(foodChoice);
            return foodValue;
        }else{
            return 1;
        }

    }
    public int calculateDrinksCost(Integer drinkChoice){
        drinksCost.put(1, 260);
        drinksCost.put(2, 300);
        drinksCost.put(3, 320);
        drinksCost.put(4, 200);
        drinksCost.put(5, 350);

        if (drinkChoice.equals(1)){
            int drinksValue = drinksCost.get(drinkChoice);
            return drinksValue;
        }else{
            return 1;
        }
    }

    public int calculateEntertainmentCost(Integer entertainmentChoice){
        entertainmentCost.put(1, 900);
        entertainmentCost.put(2, 2000);
        entertainmentCost.put(3, 0);

        return 1;
    }
}
