interface Car{
    void start();
    void stop();
}

interface Bike{
    void start();
    void stop();
}

class cars implements Car{
    public void start(){
        System.out.println("Car is started");
    }
    public void stop(){
        System.out.println("Car is stopped");
    }
}

class bikes implements Bike{
    public void start(){
        System.out.println("Bike is started");
    }
    public void stop(){
        System.out.println("Bike is stopped");
    }
}

public class VehicalInterface {
    public static void main(String[] args) {
        Car car = new cars();
        Bike bike = new bikes();
        car.start();
        car.stop();
        bike.start();
        bike.stop();
    }
}
