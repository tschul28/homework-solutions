public class Publication {

    private String title;
    private int year;

    public Publication(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public void getInfo() {
        System.out.println(this.title + ", published in " + this.year);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
