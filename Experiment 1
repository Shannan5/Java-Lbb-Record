class Book {
    int bookId;
    String title, author, category;
    double price;
    boolean available;

    Book(int id, String t, String a, String c, double p, boolean av) {
        bookId = id;
        title = t;
        author = a;
        category = c;
        price = p;
        available = av;
    }

    void displayBookDetails() {
        System.out.println(bookId + " " + title + " " + author);
        System.out.println(category + " " + price + " " + available);
    }

    public static void main(String[] args) {
        Book b1 = new Book(1, "Java", "James", "IT", 500, true);
        Book b2 = new Book(2, "Python", "Guido", "IT", 400, true);

        b1.displayBookDetails();
        b2.displayBookDetails();
    }
}
