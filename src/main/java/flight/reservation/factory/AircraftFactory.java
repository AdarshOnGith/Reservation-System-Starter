package flight.reservation.factory;

import flight.reservation.plane.Aircraft;

public interface AircraftFactory {
    Aircraft createAircraft(String model);
    
}