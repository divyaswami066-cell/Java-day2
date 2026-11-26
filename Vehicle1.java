 abstract class Vehicle1 {
    abstract void start();
    void run() {
        System.out.println("Vehicle is running");
    }   
}
class Bike extends Vehicle1 {
    @Override
    void start() {
        System.out.println("Bike is starting");
    }
}
class Main {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
        b.run();
    }
}
