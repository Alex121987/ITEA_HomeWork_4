package HW_4_Task1;

/**
 * Створіть проект з класом Main.java.
 * Потрібно: Створити клас Book. Створити класи Title, Author та Content,
 * кожен з яких повинен містити одне рядкове поле та метод void show().
 * Реалізувати можливість додавання назви книги, імені автора та змісту.
 * Виведіть на екран за допомогою методу show() назву книги, ім'я автора та Зміст.
 */
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setAuthor(new Author("Chuck Palaniuk"));
        book1.setTitle(new Title("Choke"));
        book1.setContent(new Content("Book about the man Viktor Mancini and his friend Denny."));

        book1.getAuthor().show();
        book1.getTitle().show();
        book1.getContent().show();
    }
}
