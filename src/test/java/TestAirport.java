import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAirport {

    Airport airport;
    Passenger passenger;
    Plane plane;
    Flight flight;
    Ticket ticket;

    @Before
    public void before (){
      airport = new Airport("BAR", 10000);
      passenger = new Passenger("bob", 1000);
      plane = new Plane(Type.BOEING747, "safety first");
      ticket = new Ticket(100);
      flight = new Flight(null, 0, null, ticket.getCost());
    }

    @Test
    public void canAddPassengerToPlane(){
        plane.addPassenger(passenger);
        assertEquals(1, plane.countPassengers());
    }
    @Test
    public void canAddPlaneToHanger(){
            airport.addPlane(plane);
            assertEquals(1, airport.countPlanes());
    }
    @Test
    public void CanRemovePassengerFromPlane(){
        plane.addPassenger(passenger);
        plane.removePassenger(passenger);
        assertEquals(0, plane.countPassengers());
    }
    @Test
    public void canRemovePlaneFromHanger() {
        airport.addPlane(plane);
        airport.removePlane(plane);
        assertEquals(0,airport.countPlanes());
    }
    @Test
    public void canAddPlaneToFlight(){
        flight.setPlane(plane);
        assertEquals(Type.BOEING747, flight.getPlane().getType());
    }
    @Test
    public void canAddNumberToFlight(){
        flight.setFlightNumber(345);
        assertEquals(345, flight.getFlightNumber());
    }
    @Test
    public void canSetDestinationOfFlight(){
        flight.setDestination("Glasgow");
        assertEquals("Glasgow", flight.getDestination());
    }
    @Test
    public void canSellTickets(){
        double result = passenger.getCash() - flight.getPrice();
        double result2 = airport.getCash() + flight.getPrice();
        assertEquals(900, result, 0  );
        assertEquals(10100, result2, 0  );
    }

}
