public class Book extends Publication {

    private String author;

    public Book(String title, int year, String author) {
        super(title, year);
        this.author = author;
    }

    @Override
    public void getInfo() {
        System.out.println(getTitle() + ", published in " + getYear() + ", by " + this.author);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
