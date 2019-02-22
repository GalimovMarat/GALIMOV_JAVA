public class Parking {
    Vehicles vehicles;
    public int MAX_PARKING_SIZE = 5;
    private ParkingPlace place[];





    public Parking() {
        this. place = new ParkingPlace[MAX_PARKING_SIZE];
        for (int i = 0; i < MAX_PARKING_SIZE ; i++) {
            this.place[i] = new ParkingPlace();

        }
    }

    public void park (Vehicles vehicles) {
        if (vehicles.isParkMarker() == false){
            System.out.println(vehicles.getName() + " " + vehicles.getRegistrationNumber() + " паркуется");
            for (int i = 0; i < MAX_PARKING_SIZE ; i++) {
                if (this.place[i].getRegNumber() == null){
                    this.place[i].setVehicles(vehicles);
                    this.place[i].setRegNumber(vehicles.getRegistrationNumber());
                    //System.out.println(place[i].getRegNumber());
                    this.place[i].setNumberOfParkPlace(i);
                    vehicles.setParkMarker(true);
                    vehicles.setParkingPlaceUsed(i);
                    System.out.println(vehicles.name + " припаркован на место №" + i);
                    return;
                }
            }
        }
        else{
            System.out.println("Уже припаркован!!!");
        }
    }

    public  void unPark (Vehicles vehicles){
        if (vehicles.getParkingPlaceUsed() == -1){
            System.out.println(vehicles.getName() + " " + vehicles.getRegistrationNumber() + " не на парковке.");
        }
        else {
            place[vehicles.getParkingPlaceUsed()].setVehicles(null);
            place[vehicles.getParkingPlaceUsed()].setRegNumber(null);
            System.out.println(vehicles.getName() + " " + vehicles.getRegistrationNumber() + " покинул парковку.");
            vehicles.setParkingPlaceUsed(-1);
            vehicles.setParkMarker(false);
        }


    }

}
