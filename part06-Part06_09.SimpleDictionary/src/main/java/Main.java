
import java.util.Dictionary;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Try out how the different parts of the program work together
        // here
        Scanner scan=new Scanner(System.in);
        SimpleDictionary dic=new SimpleDictionary();
        TextUI ui=new TextUI(scan, dic);
        ui.start();
    }
}
