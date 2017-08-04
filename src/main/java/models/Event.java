package models;

public class Event {
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
}
