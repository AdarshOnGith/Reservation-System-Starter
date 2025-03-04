package flight.reservation.factory;

import flight.reservation.plane.Aircraft;
import flight.reservation.plane.aircraftBuilder.PassengerDroneBuilder;


public class DroneFactory implements AircraftFactory {
    @Override
    public Aircraft createAircraft(String model){
        return new PassengerDroneBuilder()
                    .setModel(model)
                    .build();
    }
}