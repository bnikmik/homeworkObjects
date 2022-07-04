public class Book {
    private final String nameBook;
    private final Author author;
    private int pubYear;

    public Book(String nameBook, Author author, int pubYear) {
        this.nameBook = nameBook;
        this.author = author;
        this.pubYear = pubYear;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPubYear() {
        return pubYear;
    }

    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }
}
