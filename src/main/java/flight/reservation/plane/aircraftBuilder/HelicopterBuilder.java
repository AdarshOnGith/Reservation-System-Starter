package flight.reservation.plane.aircraftBuilder;

import flight.reservation.plane.Helicopter;

public class HelicopterBuilder implements AircraftBuilder<Helicopter> {
    private String model;
    private int passengerCapacity;
    private final int crewCapacity = 2;
    
    @Override
    public HelicopterBuilder setModel(String model) {
        this.model = model;
        if (model.equals("H1")) {
            passengerCapacity = 4;
        } else if (model.equals("H2")) {
            passengerCapacity = 6;
        } else {
            throw new IllegalArgumentException(String.format("Model type '%s' is not recognized", model));
        }
        return this;
    }
    
    @Override
    public Helicopter build() {
        return new Helicopter(model, passengerCapacity, crewCapacity);
    }
}