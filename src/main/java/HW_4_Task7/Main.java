package HW_4_Task7;

/**
 * Створіть проект з класом Main.java.
 * Створити клас Vehicle. У тілі класу створіть поля: координати та параметри суден (ціна, швидкість, рік випуску).
 * Створіть 3 похідних класи Plane, Саг та Ship. Для класу Plane має бути визначена висота та кількість пасажирів.
 * Для класу Ship – кількість пасажирів та порт приписки. Написати програму, яка виводить на екран інформацію про
 * кожен засіб пересування.
 */
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car(10000, 200, 2023);
        Vehicle plane = new Plane(100_000, 3000, 2020, 10000, 30);
        Vehicle ship = new Ship(1_000_000, 100, 2019, 2000, "Valencia");

        System.out.println(car);
        System.out.println(plane);
        System.out.println(ship);
    }
}
