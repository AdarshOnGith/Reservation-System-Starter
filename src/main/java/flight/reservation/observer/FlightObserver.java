package flight.reservation.observer;

public interface FlightObserver {
    void flightStatusChanged(String change);
}