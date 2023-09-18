package HW_4_Task6;

public class ExcellentPupil extends Pupil {
    @Override
    void study() {
        System.out.println("I'm studying 6 hours per day.");;
    }

    @Override
    void read() {
        System.out.println("I'm reading one book per day.");
    }

    @Override
    void write() {
        System.out.println("I'm writing everything useful for me.");
    }

    @Override
    void relax() {
        System.out.println("I'm doing yoga for relaxing.");
    }
}
