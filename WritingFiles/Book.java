import java.util.Scanner;

public class Book {
    private String author;
    private String title;
    private long isbn;
    private double rating;

    public Book(long isbn, String author, String title, double rating){
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.rating = rating;
    }

    public Book(Scanner input){
        // read in the line of info
        String bookLine = input.nextLine();
        // split the String up by the comma(,)
        String[] bookInfo = bookLine.split(",");

        // put all the pieces into the variables
        this.isbn = Long.parseLong(bookInfo[0]);
        this.author = bookInfo[1];
        this.title = bookInfo[2];
        this.rating = Double.parseDouble(bookInfo[3]);
    }

    public long getISBN(){
        return this.isbn;
    }

    @Override
    public String toString(){
        return this.isbn + "," + this.author 
                   + "," + this.title + "," + this.rating;
    }
}
