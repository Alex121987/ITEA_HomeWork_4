package HW_4_Task3;

/**
 * Створити клас Машина з полями рік(int), колір(String). Створити конструктор за замовчуванням,
 * конструктор з одним і 2 параметрами. Створити клас Main в якому створити екземпляри,
 * викликаючи різні конструктори.
 */
public class Main {
    public static void main(String[] args) {
        Car volkswagen = new Car();
        Car ford = new Car("green");
        Car opel = new Car("1992");
        Car mazda = new Car(2006, "Grey");

        System.out.println("Volksvagen" + volkswagen.toString());
        System.out.println("Ford" + ford.toString());
        System.out.println("Opel" + opel.toString());
        System.out.println("Mazda" + mazda.toString());
    }
}
