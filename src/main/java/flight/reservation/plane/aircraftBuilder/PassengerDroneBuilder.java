package flight.reservation.plane.aircraftBuilder;

import flight.reservation.plane.PassengerDrone;

public class PassengerDroneBuilder implements AircraftBuilder<PassengerDrone> {
    private String model;
    private final int passengerCapacity = 1;
    private final int crewCapacity = 0;
    
    @Override
    public PassengerDroneBuilder setModel(String model) {
        if (model.equals("HypaHype")) {
            this.model = model;
        } else {
            throw new IllegalArgumentException(String.format("Model type '%s' is not recognized", model));
        }
        return this;
    }
    
    @Override
    public PassengerDrone build() {
        return new PassengerDrone(model, passengerCapacity, crewCapacity);
    }
}