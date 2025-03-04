package flight.reservation.plane.aircraftBuilder;

import flight.reservation.plane.PassengerPlane;

public class PassengerPlaneBuilder implements AircraftBuilder<PassengerPlane> {
    private String model;
    private int passengerCapacity;
    private int crewCapacity;
    
    @Override
    public PassengerPlaneBuilder setModel(String model) {
        this.model = model;
        switch (model) {
            case "A380":
                this.passengerCapacity = 500;
                this.crewCapacity = 42;
                break;
            case "A350":
                this.passengerCapacity = 320;
                this.crewCapacity = 40;
                break;
            case "Embraer 190":
                this.passengerCapacity = 25;
                this.crewCapacity = 5;
                break;
            case "Antonov AN2":
                this.passengerCapacity = 15;
                this.crewCapacity = 3;
                break;
            default:
                throw new IllegalArgumentException(String.format("Model type '%s' is not recognized", model));
        }
        return this;
    }
    
    @Override
    public PassengerPlane build() {
        return new PassengerPlane(model, passengerCapacity, crewCapacity);
    }
}