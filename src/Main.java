public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        // Create authors
        Author author1 = new Author("Стивен", "Кинг");
        Author author2 = new Author("Джордж", "Мартин");
        // Create books
        Book book1 = new Book("Властелин колец", author1, 1954);
        Book book2 = new Book("Игра престолов", author2, 1996);
        // Data readout
        System.out.printf("Book 1. Author: %s, Book: %s, Publish Date: %s year\n", book1.getAuthor(), book1.getTitle(), book1.getPublishDate());
        System.out.printf("Book 2. Author: %s, Book: %s, Publish Date: %s year\n", book2.getAuthor(), book2.getTitle(), book2.getPublishDate());
        // Change data
        System.out.println("Book 1. Publish date was changed");
        book1.setPublishDate(1991);
        // Date readout
        System.out.printf("Book 1. Author: %s, Book: %s, Publish Date: %s year\n", book1.getAuthor(), book1.getTitle(), book1.getPublishDate());
        System.out.printf("Book 2. Author: %s, Book: %s, Publish Date: %s year\n", book2.getAuthor(), book2.getTitle(), book2.getPublishDate());
    }
}