public class Flight {

    private Plane plane;
    private int flightNumber;
    private String destination;
    private double price;

    public Flight(Plane plane, int flightNumber, String destination, double price){
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.price = price;
    }


    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
