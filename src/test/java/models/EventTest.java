package models;

import org.junit.Test;
import static org.junit.Assert.*;

public class EventTest {
    @Test
    public void newEvent_instantiateCorrectly_true () throws Exception{
        Event testEvent = new Event();
        assertEquals(true, testEvent instanceof Event);
    }
    @Test
    public void newEvent_PlannerMethod_NumofGuests(){
        Event testEvent = new Event();
        assertEquals(10, testEvent.planner(10));
    }
    @Test
    public void newEvent_CostPerGuestMethod_120(){
        Event testEvent = new Event();
        assertEquals(120, testEvent.costOfGuest(10));
    }
    @Test
    public void newEvent_CalculateFoodCost_0(){
        Event testEvent = new Event();
        assertEquals(1, testEvent.calculateFoodCost(0));
    }
    @Test
    public void newEvent_CalculateFoodCost_1(){
        Event testEvent = new Event();
        assertEquals(500, testEvent.calculateFoodCost(1));
    }
    @Test
    public void newEvent_CalculateDrinksCost_0(){
        Event testEvent = new Event();
        assertEquals(1, testEvent.calculateDrinksCost(0));
    }
    @Test
    public void newEvent_CalculateDrinksCost_1(){
        Event testEvent = new Event();
        assertEquals(260, testEvent.calculateDrinksCost(0));
    }
    @Test
    public void newEvent_CalculateEntertainmentCost_0(){
        Event testEvent = new Event();
        assertEquals(1, testEvent.calculateEntertainmentCost(0));
    }
}
