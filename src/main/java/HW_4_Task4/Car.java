package HW_4_Task4;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;
    public Car() {
        this.year = 1990;
        this.speed = 120;
        this.weight = 1400;
        this.color = "Black";
    }

    public Car(String color) {
        this();
        this.color = color;
    }

    public Car(double speed, String color) {
        this(color);
        this.speed = speed;
    }

    public Car(double speed, int weight, String color) {
        this(speed, color);
        this.weight = weight;
    }

    public Car(int year, double speed, int weight, String color) {
        this(speed, weight, color);
        this.year = year;
    }

    @Override
    public String toString() {
        return   "year=" + year +
                ", speed=" + speed +
                ", weight=" + weight +
                ", color='" + color + '\'';
    }
}
