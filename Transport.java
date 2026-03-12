package Task06;

public class Transport {
    public void fare(){
        System.out.println("The fare of transportation vehicles.");
    }

    public static void main(String[] args) {
        Transport b = new Bus();
        Transport t = new Train();
        Transport taxi = new Taxi();

        b.fare();
        t.fare();
        taxi.fare();
    }
}

class Bus extends Transport{
    @Override
    public void fare() {
        double fare = 70;
        System.out.println("Fare Of Bus Is: " + fare);
    }
}

class Train extends Transport{
    @Override
    public void fare() {
        double fare = 700;
        System.out.println("Fare Of Train Is: " + fare);
    }
}

class Taxi extends Transport{
    @Override
    public void fare() {
        double fare = 500;
        System.out.println("Fare Of Taxi Is: " + fare);
    }
}