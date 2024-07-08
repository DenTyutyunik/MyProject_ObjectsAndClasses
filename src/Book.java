public class Book {

    private String title;
    private Author author;
    private int publishDate;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publishDate = publicationYear;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author.getFullName();
    }

    public int getPublishDate() {
        return this.publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }
}