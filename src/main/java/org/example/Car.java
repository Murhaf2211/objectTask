package org.example;

public class Car {
    // Properties of the Car
    public String brand;
    public String model;
    public String color;
    public int yearOfManufacture;
    public int speed;


    public Car(String brand, String model, String color, int yearOfManufacture) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
        this.speed = 0;
    }


    public void startCar(){
        System.out.println("The car " + brand +""+ model +" Has started. ");
    }

    public void speed(int num) {
        speed += num;
        System.out.println("The car speed is " + speed + " km/h.");
    }
}
