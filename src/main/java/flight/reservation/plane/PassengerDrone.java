package flight.reservation.plane;

public class PassengerDrone implements Aircraft {
    private final String model;
    public final int passengerCapacity;
    public final int crewCapacity;

    public PassengerDrone(String model, int passengerCapacity, int crewCapacity) {
        this.model = model;
        this.passengerCapacity = passengerCapacity;
        this.crewCapacity = crewCapacity;
    }

    public PassengerDrone(String model) {
        if (model.equals("HypaHype")) {
            this.model = model;
        } else {
            throw new IllegalArgumentException(String.format("Model type '%s' is not recognized", model));
        }
        this.crewCapacity = 0;
        this.passengerCapacity = 1;
    }

    
    @Override
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public String getModel() {
        return model;
    }
    

    @Override
    public int getCrewCapacity() {
        return crewCapacity;
    }
    
    @Override
    public String toString() {
        return "PassengerDrone " + model;
    }
}
