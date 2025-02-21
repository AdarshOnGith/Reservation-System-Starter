package flight.reservation.observer;

public interface FlightStatusSubject {
    void addObserver(FlightObserver observer);
    void removeObserver(FlightObserver observer);
    void notifyObservers(String change);
}