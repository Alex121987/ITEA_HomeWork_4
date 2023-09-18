package HW_4_Task6;

public class GoodPupil extends Pupil {
    @Override
    void study() {
        System.out.println("I'm studying 4 hours per day.");
    }

    @Override
    void read() {
        System.out.println("I'm reading 100 pages per day.");
    }

    @Override
    void write() {
        System.out.println("I'm trying to write abstract on lectures.");
    }

    @Override
    void relax() {
        System.out.println("I like doing sports, when i have free time.");
    }
}
