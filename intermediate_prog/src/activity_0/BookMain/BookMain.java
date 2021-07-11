package BookMain;

class Author {
    private String name, email, gender;

    public Author(String name, String email, String gender) {
        this.name = name;
        if (email.contains("@"))
            this.email = email;
        else
            System.out.println("Invalid email! Set to empty string");
        if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))
            this.gender = gender;
        else
            System.out.println("Invalid gender! Set to Unknown.");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void print() {
        System.out.println("AUTHOR : " + getName());
        System.out.println("GENDER : " + getGender());
        System.out.println("E-MAIL : " + getEmail());
        System.out.println();
    }
}

class Book {
    private String bookTitle;
    private double price;
    private int stock = 0;
    private final Author author;

    public Book(String bookTitle, Author author, double price, int stock) {
        this.bookTitle = bookTitle;
        this.author = author;
        if (price > 0)
            this.price = price;
        else
            System.out.println("Note: Price should be positive! Set to 0");
        if (stock >= 0)
            this.stock = stock;
        else
            System.out.println("Book stocks cannot be negative! Set to 0");
    }

    public Author getAuthor() {
        return this.author;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void print() {
        System.out.println("Book Title : " + this.bookTitle);
        getAuthor().print();
        System.out.println();
    }
}

public class BookMain {
    public static void main(String[] args) {
        Author author1 = new Author("Marcus Laurence", "mlaurce.neu.edu.ph", "male");
        author1.print();

        Book bk1 = new Book("Do androids dream of electric sheep?", author1, -699.69, -5);
        bk1.print();

        author1.setEmail("hokdog@hotmail.com");
        author1.print();
        bk1.print();

        bk1.getAuthor().setEmail("laurence.marcus@gmail.com");
        bk1.print();
    }
}
