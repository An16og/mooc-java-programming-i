import java.util.ArrayList;
import java.util.Scanner;


public class UserInterface {

    private Scanner scan;
    private JokeManager box;
    public UserInterface(JokeManager list,Scanner scan){
        this.scan=scan;
        this.box=list;
    }
    public void start(){
    System.out.println("What a joke!");
    while (true) {
        System.out.println("Commands:");
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");
        System.out.println(" 3 - list jokes");
        System.out.println(" X - stop");
        String command = scan.nextLine();
        if (command.equals("X")) {
        break;
        }
        if (command.equals("1")) {
        System.out.println("Write the joke to be added:");
        String joke = scan.nextLine();
        box.addJoke(joke);
        } else if (command.equals("2")) {
         System.out.println(box.drawJoke());
        }
        else if (command.equals("3")) {
       box.printJokes();
        }else{
            System.out.println("Invalid");
        }
        }
    }
}
