public class Aircraft extends Vehicles{
    public int flightAltitude;


    public Aircraft(String name, String registrationNumber, int flightAltitude) {
        super(name, registrationNumber);
        this.flightAltitude = flightAltitude;
    }


}