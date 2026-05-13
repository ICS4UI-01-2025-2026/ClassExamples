import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class BookCollection {
    private ArrayList<Book> books;
    private String csvFilename;
    
    public BookCollection(String csvFile){
        this.books = new ArrayList<>();
        this.csvFilename = csvFile;

        // Scanner to read in file
        Scanner input = null;
        try{
            input = new Scanner(new File(csvFile));
        }catch(Exception e){
            e.printStackTrace();
        }

        // remove top header
        input.nextLine();

        // read in the rest of the books
        // does the Scanner still have input left?
        while(input.hasNext()){
            // create a book
            Book newBook = new Book(input);
            // add it to my list
            this.books.add(newBook);
        }

    }


    public boolean removeBook(long isbn){
        // find the book
        // NEW: Enhanced For Loop / ForEach Loop
        Book foundBook = null;
        for (Book b : this.books) {
            // does this book ISBN match?
            if(b.getISBN() == isbn){
                // set the found book and stop searching
                foundBook = b;
                break;
            }
        }
        // if found, remove the book
        if(foundBook != null){
            this.books.remove(foundBook);
            this.saveFile();
            return true;
        }else{
            // didn't find the book to remove
            return false;
        }
    }

    private void saveFile(){
        // create a PrintWriter to write to a file
        PrintWriter output = null;
        try{
            output = new PrintWriter(new File(this.csvFilename));
        }catch(Exception e){
            e.printStackTrace();
        }
        // print the header
        output.println("isbn13,authors,title,average_rating");
        // go through and print each book to the file
        for(Book b: this.books){
            output.println(b);
        }
        // close the printwriter to finalize changes
        // if you don't do this, nothing will be written!
        output.close();
    }

}
