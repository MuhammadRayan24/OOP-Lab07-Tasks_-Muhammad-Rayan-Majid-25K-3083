package Task08;

public class SmartDevice {
    public void turnOn(){
        System.out.println("Device Is On.");
    }

    public static void main(String[] args) {
        SmartDevice devices[] = {new SmartLight() , new SmartFan() , new SmartAC()};

        for(SmartDevice d : devices){
            d.turnOn();
        }
    }
}

class SmartLight extends SmartDevice{
    @Override
    public void turnOn() {
        System.out.println("Smart Light Is On.");
    }
}

class SmartFan extends SmartDevice{
    @Override
    public void turnOn() {
        System.out.println("Smart Fan Is On.");
    }
}

class SmartAC extends SmartDevice{
    @Override
    public void turnOn() {
        System.out.println("Smart AC Is On.");
    }
}