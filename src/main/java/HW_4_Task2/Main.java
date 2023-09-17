package HW_4_Task2;

/**
 * Створіть проект з класом Main.java.
 *
 * Потрібно: Створити клас  Address. У тілі класу потрібно створити поля: index, country, city, street,
 * house, apartment. Для кожного поля створити метод з двома методами доступу (get, set)
 * Створити екземпляр класу Address. У поля экземпляра записати інформацію.
 * Виведіть на екран значення полів, що описують адресу.
 */
public class Main {
    public static void main(String[] args) {
        Adress adress = new Adress();
        adress.setIndex("18000");
        adress.setCountry("Ukraine");
        adress.setCity("Cherkassy");
        adress.setStreet("Schevchenka str.");
        adress.setHouse(88);
        adress.setApartment(6);

        System.out.println(adress);
    }
}
