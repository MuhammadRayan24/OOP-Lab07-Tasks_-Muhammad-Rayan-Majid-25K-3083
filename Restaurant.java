package Task07;

public class Restaurant {
    public double calculateDeliveryFee(double distance){
        return 0;
    }

    public static void main(String[] args) {
        Restaurant ff = new FastFoodRestaurant();
        Restaurant fd = new FineDiningRestaurant();
        Restaurant cr = new CafeRestaurant();

        double distance = 14;

        System.out.println("Fast Food Restaurant Delivery Fee: " + (ff.calculateDeliveryFee(distance)));
        System.out.println("Fine Dining Restaurant Delivery Fee: " + (fd.calculateDeliveryFee(distance)));
        System.out.println("Cafe Restaurant Delivery Fee: " + (cr.calculateDeliveryFee(distance)));
    }
}

class FastFoodRestaurant extends Restaurant{
    @Override
    public double calculateDeliveryFee(double distance) {
        return 60+(distance*10);
    }
}

class FineDiningRestaurant extends Restaurant{
    @Override
    public double calculateDeliveryFee(double distance) {
        return 110+(distance*20);
    }
}

class CafeRestaurant extends Restaurant{
    @Override
    public double calculateDeliveryFee(double distance) {
        return 50+(distance*15);
    }
}