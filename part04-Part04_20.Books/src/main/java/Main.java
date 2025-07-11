import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList <Book> booklist= new ArrayList<>();
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        while (true) {
        System.out.println("Title");
        String name = scan.nextLine();
        if(name.isEmpty()){
            break;
        }
        System.out.println("Pages: ");
        int page=Integer.valueOf(scan.nextLine());
        System.out.println("Publication year: ");
        int year=Integer.valueOf(scan.nextLine());
        booklist.add(new Book(name, page, year));



        }
        System.out.println("What information will be printed? ");
        String prompt=scan.nextLine();
        if (prompt.equals("everything")) {
            for(Book book:booklist){
                System.out.println(book);
            }
        }
        if (prompt.equals("name")) {
            for(Book book:booklist){
                System.out.println(book.getName());
            }
        }
    }
}
