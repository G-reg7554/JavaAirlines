import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;

    @Before
    public void setUp(){
        passenger = new Passenger("John",3);
    }

    @Test
    public void hasNameTest(){
        assertEquals("John", passenger.getName());
    }

    @Test
    public void checkBagsAmountTest(){
        assertEquals(3, passenger.checkBags());
    }
}
