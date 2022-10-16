import java.util.ArrayList;
import java.util.Collection;

public class Flight {
    Destination destination;
    Departure departure;
    Pilot pilot;
    CrewMember crewMember;
    Passenger passenger;
    private ArrayList<Pilot> pilotCollection;
    private ArrayList<CrewMember> crewCollection;
    private ArrayList<Passenger> passengerCollection;
    private String flightNumber;
    private String departureTime;

    private int capacity;

    public Flight(String flightNumber, String departureTime, Departure departure, Destination destination, int capacity) {
        this.departure = departure;
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.pilotCollection = new ArrayList<>();
        this.crewCollection = new ArrayList<>();
        this.passengerCollection = new ArrayList<>();
        this.capacity = capacity;

    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getHolidayDestination() {
        return this.destination.arrival;
    }

    public String getDepartureAirport() {
        return this.departure.leaving;
    }

    public boolean addPilots() {
        return pilotCollection.add(pilot);
    }

    public int checkPilots() {
        return pilotCollection.size();
    }

    public boolean addCrewMembers() {
        return crewCollection.add(crewMember);
    }

    public int checkCrewMembers() {
        return crewCollection.size();
    }

    public void removePassenger() {
        if (this.passengerCollection.size() > capacity) {
            passengerCollection.remove(passenger);
        }

    }

    public boolean addPassengers() {
        return passengerCollection.add(passenger);
    }

    public int checkPassengers() {
        return passengerCollection.size();
    }

    public String departureTime() {
        return this.departureTime;
    }

    public int checkCapacity(){
        return this.capacity;
    }
}




