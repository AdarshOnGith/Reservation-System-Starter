package flight.reservation.factory;

import flight.reservation.plane.Aircraft;
import flight.reservation.plane.aircraftBuilder.HelicopterBuilder;


public class HelicopterFactory implements AircraftFactory {
    @Override
    public Aircraft createAircraft(String model){
        // Aircraft heli= new Helicopter(model);
        // return heli;
        return new HelicopterBuilder()
                    .setModel(model)
                    .build();
    }
}