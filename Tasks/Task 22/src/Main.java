public class Main {
    public static void main(String[] args) {

        Parking parking = new Parking();
        Aircraft Boeing = new Aircraft("Boeing", "VQ BNF", 10000);


       // Boeing.onParking(parking);
        Boeing.onParking(parking);
       // Boeing.outOfTheParking(parking);
        Boeing.outOfTheParking(parking);

    }
}
