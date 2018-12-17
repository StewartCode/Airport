import java.util.ArrayList;

public class Plane {
    private Type type;
    private String airline;
    private ArrayList<Passenger> passengers;

    public Plane(Type type, String airline){
        this.type = type;
        this.airline = airline;
        this.passengers = new ArrayList<>();
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public int countPassengers() {
       return this.passengers.size();
    }
    public void addPassenger(Passenger passenger){
        this.passengers.add(0, passenger);
    }

    public void removePassenger(Passenger passenger) {
        this.passengers.remove(passenger);
    }
}
