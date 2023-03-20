import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int countBooks = 3;
        System.out.println("Insert the information of a book");
        System.out.println("________________________________");
        for(int x=1 ; x<countBooks+1; x++){
            System.out.println(print(x));
        }
    }

    public static String print(int x){
        //call scanner Object
        Scanner sc = new Scanner(System.in);
        System.out.println("Information of book " + x + ":" );
        //input title of book
        System.out.print("Input name of the book: " );
        String bookTitle = sc.nextLine();
        //author
        System.out.print("Input the author: " );
        String bookAuthor = sc.nextLine();
        //call constructores
        Books books = new Books(bookTitle, bookAuthor);
        return x + ": Title = " + books.getTitle() + " , Author = "  + books.getAuthor() + "\n";
    }


}