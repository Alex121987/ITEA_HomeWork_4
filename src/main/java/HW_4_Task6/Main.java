package HW_4_Task6;

/**
 * Створіть проект з класом Main.java.
 * Створити клас, який представляє навчальний клас ClassRoom. Створіть клас учень Pupil.
 * У тілі класу створіть методи void study(), void read(), void write(), void relax().
 * Створіть 3 похідні класу ExcelentPupil, GoodPupil, BadPupil від класу базового класу Pupil і
 * перевизначте кожен із методів, залежно від успішності учня. Конструктор класу ClassRoom
 * приймає аргументи типу Pupil, клас має складатися з 4 учнів. Передбачте можливість,
 * що користувач може передати 2 або 3 аргументи. Виведіть інформацію про те, як усі учні
 * екземпляра класу ClassRoom вміють навчатися, читати, писати, відпочивати.
 */
public class Main {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        Pupil excellentPupil = new ExcellentPupil();
        Pupil goodPupil = new GoodPupil();
        Pupil badPupil = new BadPupil();

        ClassRoom classRoom = new ClassRoom(pupil, excellentPupil, goodPupil, badPupil);

        classRoom.getPupil1().study();
        classRoom.getPupil1().read();
        classRoom.getPupil1().write();
        classRoom.getPupil1().relax();

        System.out.println();

        classRoom.getPupil2().study();
        classRoom.getPupil2().read();
        classRoom.getPupil2().write();
        classRoom.getPupil2().relax();

        System.out.println();

        classRoom.getPupil3().study();
        classRoom.getPupil3().read();
        classRoom.getPupil3().write();
        classRoom.getPupil3().relax();

        System.out.println();

        classRoom.getPupil4().study();
        classRoom.getPupil4().read();
        classRoom.getPupil4().write();
        classRoom.getPupil4().relax();
    }
}
