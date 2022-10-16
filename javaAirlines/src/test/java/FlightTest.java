import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class FlightTest {
    Destination destination;
    Departure departure;
    private Flight flight;

    @Before
    public void setUp(){
        flight = new Flight("IU11(Z34D)","19:40", Departure.EDINBURGH, Destination.ALICANTE, 3);

    }

    @Test
    public void FlightTest(){
        flight.addPilots();
        flight.addCrewMembers();
        flight.addCrewMembers();
        assertEquals(0, flight.checkPassengers());
        assertEquals(2, flight.checkCrewMembers());
        assertEquals("IU11(Z34D)", flight.getFlightNumber());
        assertEquals("EDI", flight.getDepartureAirport());
        assertEquals("ALC", flight.getHolidayDestination());
        assertEquals("19:40", flight.departureTime());
        flight.addPassengers();
        flight.addPassengers();
        flight.addPassengers();
        flight.addPassengers();
        flight.removePassenger();
        assertEquals(3, flight.checkPassengers());
        assertEquals(3, flight.checkCapacity());

    }



}
