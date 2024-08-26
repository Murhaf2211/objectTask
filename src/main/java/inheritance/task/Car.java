package inheritance.task;

public class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String manufacturer, String model, String yearOfManufacture, int numberOfDoors) {
        super(manufacturer, model, yearOfManufacture);
        this.numberOfDoors = numberOfDoors;

    }
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                "} " + super.toString();
    }




}
