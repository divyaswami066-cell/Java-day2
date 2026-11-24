
class Book {
    String title;
    double price;

    Book() {
        title = "Unknown";
        price = 0.0;
    }

    Book(String t) {
        title = t;
        price = 0.0;
    }

    Book(String t, double p) {
        title = t;
        price = p;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}

class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java");
        Book b3 = new Book("Python", 250.0);

        b1.display();
        b2.display();
        b3.display();
    }
}
