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
        book1.author = new Author("Chuck Palaniuk");
        book1.title = new Title("Choke");
        book1.content = new Content("Book about the man Viktor Mancini and his friend Denny.");

        book1.author.show();
        book1.title.show();
        book1.content.show();
    }
}
