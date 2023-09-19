package HW_4_Task9;

public class LaserPrinter extends Printer {
    @Override
    void print(String value) {
        Main.counter += 1;
        System.out.println(Main.COLORS[Main.counter % Main.COLORS.length] + value + Main.RESET);
    }
}
