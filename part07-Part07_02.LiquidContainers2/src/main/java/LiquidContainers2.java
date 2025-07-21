
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container one=new Container();
        Container two=new Container();

        UserInterface UI= new UserInterface(two, one, scan);
        UI.start();
   
    }

        }
    