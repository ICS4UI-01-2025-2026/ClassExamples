import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        BookCollection collection = new BookCollection("books.txt");
        
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("What book do you want to remove?");
            long isbn = input.nextLong();
            boolean success = collection.removeBook(isbn);
            if(success){
                System.out.println("Book removed!");
            }else{
                System.out.println("Book not found!");
            }
        }

    }
}