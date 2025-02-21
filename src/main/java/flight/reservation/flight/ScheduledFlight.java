package flight.reservation.flight;

import flight.reservation.Airport;
import flight.reservation.Passenger;
import flight.reservation.observer.FlightObserver;
import flight.reservation.observer.FlightStatusSubject;
import flight.reservation.plane.Aircraft;
import flight.reservation.plane.Helicopter;
import flight.reservation.plane.PassengerDrone;
import flight.reservation.plane.PassengerPlane;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScheduledFlight extends Flight implements FlightStatusSubject {

    private final List<Passenger> passengers;
    private final Date departureTime;
    private double currentPrice = 100;
    private String status = "On Time";
    private final List<FlightObserver> observers = new ArrayList<>();

    public ScheduledFlight(int number, Airport departure, Airport arrival, Aircraft aircraft, Date departureTime) {
        super(number, departure, arrival, aircraft);
        this.departureTime = departureTime;
        this.passengers = new ArrayList<>();
    }

    public ScheduledFlight(int number, Airport departure, Airport arrival, Aircraft aircraft, Date departureTime, double currentPrice) {
        super(number, departure, arrival, aircraft);
        this.departureTime = departureTime;
        this.passengers = new ArrayList<>();
        this.currentPrice = currentPrice;
    }

    // Observer methods
    @Override
    public void addObserver(FlightObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(FlightObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String change) {
        for (FlightObserver observer : observers) {
            observer.flightStatusChanged(change);
        }
    }
    public void updateStatus(String newStatus) {
        this.status = newStatus;
        notifyObservers(newStatus);
    }
    
    public int getCrewMemberCapacity() throws NoSuchFieldException {
        return this.aircraft.getCrewCapacity();
    }


    public void addPassengers(List<Passenger> passengers) {
        this.passengers.addAll(passengers);
        //reg as observer
        for (Passenger p : passengers) {
            addObserver(p);
        }
    }

    public void removePassengers(List<Passenger> passengers) {
        this.passengers.removeAll(passengers);
       //unregister as observer
        for (Passenger p : passengers) {
            removeObserver(p);
        }
    }

    public int getCapacity() throws NoSuchFieldException {
        return this.aircraft.getPassengerCapacity();
    }

    public int getAvailableCapacity() throws NoSuchFieldException {
        return this.getCapacity() - this.passengers.size();
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
}
