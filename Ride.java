package Task09;

public class Ride {
    public double calculateFare(double distance){
        return 0;
    }

    public static void main(String[] args) {
        double distance = 14;

        Ride r;
        r = new BikeRide();
        System.out.println("Fare for the Bike Ride : " + (r.calculateFare(distance)));

        r = new CarRide();
        System.out.println("Fare for the Car Ride : " + (r.calculateFare(distance)));

        r = new LuxuryRide();
        System.out.println("Fare for the Luxury Ride : " + (r.calculateFare(distance)));

    }
}

class BikeRide extends Ride{
    @Override
    public double calculateFare(double distance) {
        return distance*15;         //distance*rate/km
    }
}

class CarRide extends Ride{
    @Override
    public double calculateFare(double distance) {
        return distance*35;          //distance*rate/km
    }
}

class LuxuryRide extends Ride{
    @Override
    public double calculateFare(double distance) {
        return distance*45;         //distance*rate/km
    }
}