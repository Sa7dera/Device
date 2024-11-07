interface Device{
    void turnOn();

    void turnOff();

    default void charge(){
        System.out.println("urzadenie sie laduje");
    }

    static void reset(){
        System.out.println("urzadznie zresetowane");
    }

}

class Smartphone implements Device{
    public void turnOn(){
        System.out.println("urzadznie wlaczone");
    }
    public void turnOff(){
        System.out.println("urzadznie wylaczone");
    }
}

class Laptop implements Device{
    public void turnOn(){
        System.out.println("urzadznie wlaczone");
    }
    public void turnOff(){
        System.out.println("urzadznie wylaczone");
    }
}

public class Main {
    public static void main(String[] args) {


        Device device = new Smartphone();
        device.turnOn();
        device.turnOff();
        device.charge();

        Device laptop = new Laptop();
        device.turnOn();
        device.turnOff();
        device.charge();

        Device.reset();

    }
}