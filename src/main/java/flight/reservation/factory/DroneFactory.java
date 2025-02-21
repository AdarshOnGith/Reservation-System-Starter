package flight.reservation.factory;

import flight.reservation.plane.Aircraft;
import flight.reservation.plane.PassengerDrone;


public class DroneFactory implements AircraftFactory {
    @Override
    public Aircraft createAircraft(String model){
        Aircraft pd= new PassengerDrone(model);
        return pd;
    }
}