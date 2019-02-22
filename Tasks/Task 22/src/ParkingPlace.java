public class ParkingPlace {
    private String regNumber;
    Vehicles vehicles;
    public int numberOfParkPlace;

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public int getNumberOfParkPlace() {
        return numberOfParkPlace;
    }

    public void setNumberOfParkPlace(int numberOfParkPlace) {
        this.numberOfParkPlace = numberOfParkPlace;
    }

    public Vehicles getVehicles() {
        return vehicles;

    }

    public void setVehicles(Vehicles vehicles) {
        this.vehicles = vehicles;
    }
}
