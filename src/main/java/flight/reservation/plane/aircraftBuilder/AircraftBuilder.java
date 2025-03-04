package flight.reservation.plane.aircraftBuilder;

import flight.reservation.plane.Aircraft;

public interface AircraftBuilder<T extends Aircraft> {
    AircraftBuilder<T> setModel(String model);
    T build();
}