package HW_4_Task7;

public class Plane extends Vehicle {
    double height;//meters
    int passengers;

    public Plane(double price, int speed, int year, double height, int passengers) {
        super(price, speed, year);
        this.height = height;
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Plane: " +
                "height=" + height +
                ", passengers=" + passengers +
                ", price=" + price +
                ", speed=" + speed +
                ", year=" + year;
    }
}
