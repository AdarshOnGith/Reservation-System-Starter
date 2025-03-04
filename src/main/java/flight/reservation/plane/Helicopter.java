package flight.reservation.plane;

public class Helicopter implements Aircraft {
    private String model;
    private final int passengerCapacity;
    private final int crewCapacity;

    public Helicopter(String model, int passengerCapacity, int crewCapacity) {
        this.model = model;
        this.passengerCapacity = passengerCapacity;
        this.crewCapacity = crewCapacity;
    }

    
    public Helicopter(String model) {
        this.model = model;
        this.crewCapacity = 2;
        if (model.equals("H1")) {
            passengerCapacity = 4;
        } else if (model.equals("H2")) {
            passengerCapacity = 6;
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
        return "Helicopter " + model;
    }
}
