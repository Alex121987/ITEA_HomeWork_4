package HW_4_Task4;

/**
 * Створити клас Машина з полями рік(int), швидкість(double), вага(int) колір(String).
 * Створити конструктор за замовчуванням, конструктор з 1 параметром, 2-а, 3-а, 4-а.
 * Перевантажити конструктори викликаючи конструктор із конструктора.
 * Створити клас Main, де створити екземпляри класу Машина з різними параметрами.
 */
public class Main {
    public static void main(String[] args) {
        Car tavria = new Car();
        Car slavuta = new Car("White");
        Car forza = new Car(160, "Green");
        Car bogdan= new Car(170, 1600, "Silver");
        Car geely = new Car(2007, 200, 1900, "Brown");

        System.out.println("Tavria: " + tavria);
        System.out.println("Slavuta: " + slavuta);
        System.out.println("Forza: " + forza);
        System.out.println("Bogdan: " + bogdan);
        System.out.println("Geely: " + geely);
    }
}
