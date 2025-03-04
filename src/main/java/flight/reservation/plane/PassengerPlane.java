package flight.reservation.plane;

public class PassengerPlane  implements Aircraft {

    public final String model;
    public final int passengerCapacity;
    public final int crewCapacity;

    public PassengerPlane(String model, int passengerCapacity, int crewCapacity) {
        this.model = model;
        this.passengerCapacity = passengerCapacity;
        this.crewCapacity = crewCapacity;

    }
    public PassengerPlane(String model) {   
        this.model = model;
        switch (model) {
            case "A380":
                passengerCapacity = 500;
                crewCapacity = 42;
                break;
            case "A350":
                passengerCapacity = 320;
                crewCapacity = 40;
                break;
            case "Embraer 190":
                passengerCapacity = 25;
                crewCapacity = 5;
                break;
            case "Antonov AN2":
                passengerCapacity = 15;
                crewCapacity = 3;
                break;
            default:
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
        return "PassengerPlane " + model;
    }

}
