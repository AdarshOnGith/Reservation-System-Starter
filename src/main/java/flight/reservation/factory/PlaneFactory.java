package flight.reservation.factory;

import flight.reservation.plane.Aircraft;
import flight.reservation.plane.aircraftBuilder.PassengerPlaneBuilder;


public class PlaneFactory implements AircraftFactory {
    @Override
    public Aircraft createAircraft(String model){
        // Aircraft pp= new PassengerPlane(model);
        // return pp;
        return new PassengerPlaneBuilder()
                    .setModel(model)
                    .build();
        
    }
}