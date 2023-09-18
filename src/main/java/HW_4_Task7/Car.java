package HW_4_Task7;

public class Car extends Vehicle {

    public Car(double price, int speed, int year) {
        super(price, speed, year);
    }

    @Override
    public String toString() {
        return "Car: " +
                "price=" + price +
                ", speed=" + speed +
                ", year=" + year;
    }
}
