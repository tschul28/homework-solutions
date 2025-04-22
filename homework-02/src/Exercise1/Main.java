public class Main {
    public static void main(String[] args) {

        Publication pub = new Publication("Publication", 2020);
        pub.getInfo();

        Book book = new Book("Book", 2018, "Author");
        book.getInfo();

        Textbook textbook = new Textbook("Textbook", 2009, "Author2", "Subject");
        textbook.getInfo();
    }
}
