package inheritance.task;

public class Motorcycle extends Vehicle {
    private String motorcycleType;

    public Motorcycle(String manufacturer, String model, String yearOfProduction, String motorcycleType) {
        super(manufacturer, model, yearOfProduction);
        this.motorcycleType = motorcycleType;

    }

    public String getMotorcycleType() {
        return motorcycleType;
    }

    public void setMotorcycleType(String motorcycleType) {
        this.motorcycleType = motorcycleType;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "motorcycleType='" + motorcycleType + '\'' +
                "} " + super.toString();
    }
}
