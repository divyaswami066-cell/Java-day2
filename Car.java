class Car {
    Car(){
        System.out.println("Car is created");
    }
    Car(int a){
        System.out.println("Car is created with parameter");}
    
}
class Main4 {
    public static void main(String[] args) {
         new Car();
         new Car(5);
    }
}
