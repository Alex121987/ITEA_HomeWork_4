package HW_4_Task1;

public class Book {
    public Title title;
    public Author author;
    public Content content;

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
