package students.Vkakurin.lesson_17_HW;

public class Book {
    private String title;
    private String author;
    private int yearIss;



    public Book(String title, String author, int yearIss) {
        this.title = title;
        this.author = author;
        this.yearIss = yearIss;
    }
    public int getYearIss() {
        return yearIss;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", autor='" + author + '\'' +
                ", yearIss=" + yearIss +
                '}';
    }

}
