package models;

/**
 * Created by Guest on 8/4/17.
 */
public class Event {
    public int planner (int numGuests){
        return numGuests;
    }
    public int costOfGuest (int numGuests){
        int costOfGuests = numGuests *12;
        return costOfGuests;
    }
}
