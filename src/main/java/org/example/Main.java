package org.example;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("BMW", "X6", "Red", 2015);
        Car yourCar = new Car("Audi" ,"A6" , "Blue" , 2010);

        myCar.startCar();
        myCar.speed(240);
        yourCar.startCar();
        yourCar.speed(220);

        Person person= new Person("Silver" , 33 , "Male" , true);
        person.itISMe();
        Person person2= new Person("Sara" , 27 , "Female" , true);
        person2.itISMe();
        Person person3= new Person("Roben" , 40 , "Male" , true);
        person3.itISMe();
    }
}