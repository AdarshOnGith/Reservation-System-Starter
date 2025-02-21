package flight.reservation.plane;

public class PassengerDrone implements Aircraft {
    private final String model;
    public int passengerCapacity = 1;
    public int crewCapacity = 0;

    public PassengerDrone(String model) {
        if (model.equals("HypaHype")) {
            this.model = model;
        } else {
            throw new IllegalArgumentException(String.format("Model type '%s' is not recognized", model));
        }
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
