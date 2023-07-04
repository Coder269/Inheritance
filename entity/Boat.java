package entity;

public class Boat extends Vehicle {

    public Boat(String brand, int kilometers){
        super(brand, kilometers);
    }

    @Override
    public void doStuff(){
        System.out.println("I am " + getBrand() + " and I go glug glug!");
    }

}
