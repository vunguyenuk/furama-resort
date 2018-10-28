public class Book {
    public String nameBook;

    public Book(String nameBook) {
        this.nameBook = nameBook;
    }

    @Override
    public String toString() {
        return "name of book: " + this.nameBook;
    }
}
