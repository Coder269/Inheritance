package entity;

public class Car extends Vehicle {

    public Car(String brand, int kilometers){
        super(brand, kilometers);

    }

    @Override
    public void doStuff(){
        System.out.println("I am " + getBrand() + " and I go zoom zoom zoom!");
    }

}
