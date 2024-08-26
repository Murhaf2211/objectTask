package inheritance.task;

public class Main {
    public static void main(String[] args) {


        Car car1= new Car("Audi", "A6", "1999",4);
        Car car2= new Car("BMV", "X5", "1998",4);

        System.out.println(car1);
        System.out.println(car2);

        Motorcycle moto = new Motorcycle("Honda", "t6", "2000", "Sport");
        System.out.println(moto);

    }
}
