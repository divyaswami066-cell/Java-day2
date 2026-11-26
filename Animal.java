public class Animal {
    public void makeSound() {
        
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: bow! bow!");
    }
}

class Main4 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.sleep();
    }
}