package HW_4_Task9;

/**
 * Створіть проект з класом Main.java.
 * Потрібно: Створити клас Printer. У тілі класу створіть метод void print(String value),
 * який виводить на екран значення аргументу. Реалізуйте можливість того,
 * щоб у разі успадкування від даного класу інших класів, та виклику відповідного методу їх екземпляра,
 * рядки, передані як аргументи методів, виводилися різними кольорами.
 * Обовʼязково використовуйте приведення типів (Upcast / Downcast Explicitly).
 */


public class Main {
    static int counter = 0;
    public static final String RESET = "\u001B[0m";
    public static final String[] COLORS = {"\u001B[30m", "\u001B[31m", "\u001B[32m", "\u001B[33m",
            "\u001B[34m",  "\u001B[35m", "\u001B[36m", "\u001B[37m"};
    // System.out.println(ANSI_RED + "This text is red!" + ANSI_RESET);

    public static void main(String[] args) {
        Printer printer = new Printer();
        LaserPrinter laserPrinter1 = new LaserPrinter();
        MatrixPrinter matrixPrinter1 = new MatrixPrinter();
        LaserPrinter laserPrinter2 = new LaserPrinter();
        MatrixPrinter matrixPrinter2 = new MatrixPrinter();

        printer.print("printer");
        laserPrinter1.print("laser printer1");
        matrixPrinter1.print("matrix printer1");
        laserPrinter2.print("laser printer2");
        matrixPrinter2.print("matrix printer2");

    }
}
