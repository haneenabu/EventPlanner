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
    public void newEvent_PlannerMethod_true(){
        Event testEvent = new Event();
        assertEquals(10, testEvent.planner(10));
    }
}