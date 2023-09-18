package HW_4_Task6;

public class BadPupil extends Pupil {
    @Override
    void study() {
        System.out.println("I don't like studying.");
    }

    @Override
    void read() {
        System.out.println("Reading books is boring.");
    }

    @Override
    void write() {
        System.out.println("I have many students in my group to take an abstract.");
    }

    @Override
    void relax() {
        System.out.println("I'm always relaxed )))");
    }
}
