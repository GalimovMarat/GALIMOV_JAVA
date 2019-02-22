public abstract class Vehicles {
    Parking parking;
    public String name;
    public String registrationNumber;

    public boolean isParkMarker() {
        return parkMarker;
    }

    public boolean parkMarker;



    private int parkingPlaceUsed;

    public Vehicles(String name, String registrationNumber) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.parkMarker = false;
        this.parkingPlaceUsed = -1;
    }

    public String getName() {
        return name;
    }

    public int getParkingPlaceUsed() {
        return parkingPlaceUsed;
    }

    public void setParkingPlaceUsed(int parkingPlaceUsed) {
        this.parkingPlaceUsed = parkingPlaceUsed;
    }

    public void setParkMarker(boolean parkMarker) {
        this.parkMarker = parkMarker;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }


    public void onParking(Parking parking) {
        parking.park(this);

    }
    public void outOfTheParking(Parking parking){
        parking.unPark(this);
    }
}
