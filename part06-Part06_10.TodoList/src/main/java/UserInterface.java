import java.net.Socket;
import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scan;

    public UserInterface(TodoList list,Scanner scan){
        this.list=list;
        this.scan=scan;
    }
    public void start(){
        while(true){
        System.out.println("Command: ");
        String command= scan.nextLine();
        if(command.equals("stop")){
            break;
        }else if(command.equals("add")){
            System.out.println("To add:");
            String addition=scan.nextLine();
            list.add(addition);
        }else if(command.equals("remove")){
            System.out.println("Which one is removed? ");
            int ind=Integer.valueOf(scan.nextLine());
            list.remove(ind);
        }else if(command.equals("list")){
            list.print();

            }else{
                System.out.println("Unknown command");
            }
        }

        }
    }

