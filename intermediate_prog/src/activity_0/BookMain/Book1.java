package BookMain;

public class Book1 {
    private String bookTitle;
    private double price;
    private int stock = 0;
    private final Author author;

    public Book1(String bookTitle, Author author, double price, int stock){
        this.bookTitle = bookTitle;
        this.author = author;
        if (price > 0)
            this.price = price;
        if (stock >= 0)
            this.stock = stock;
    }

    public Author getAuthor(){
        return this.author;
    }

    public String getBookTitle(){
        return this.bookTitle;
    }

    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getStock(){
        return this.stock;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    public void print(){
        System.out.println("Book Title : " + this.bookTitle);
        getAuthor().print();
        System.out.println();
    }
}
