import java.util.ArrayList;

public class Airport {

    private ArrayList<Plane> hangers;
    private String airportCode;
    private double cash;

    public Airport(String airportCode, double cash){
        this.hangers = new ArrayList<>();
        this.airportCode = airportCode;
        this.cash = cash;
    }

    public ArrayList<Plane> getHangers() {
        return hangers;
    }

    public void setHangers(ArrayList<Plane> hangers) {
        this.hangers = hangers;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public int countPlanes() {
       return this.hangers.size();
    }

    public void addPlane(Plane plane) {
         this.hangers.add(0, plane);
    }

    public void removePlane(Plane plane) {
        this.hangers.remove(plane);
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }
}
