package flight.reservation;

import flight.reservation.observer.FlightObserver;

public class Passenger implements FlightObserver{

    private final String name;

    public Passenger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void flightStatusChanged(String change) {
        System.out.println("Passenger " + name + " notified for: " + change);
    }
}
