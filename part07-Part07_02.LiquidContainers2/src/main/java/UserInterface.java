import java.util.Scanner;

public class UserInterface {
    private Container first;
    private Container second;
    private Scanner scan;


    public UserInterface(Container first, Container second, Scanner scan){
        this.first=first;
        this.second=second;
        this.scan=scan;
    } 
    public void start(){
    while (true) {
        System.out.print("First: "+first+"\n" +
                        "Second: "+second+"\n");
        String input= scan.nextLine();
        if (input.equals("quit")) {
                break;
            }
            String[] words= input.split(" ");
            String command =words[0];
            int value=Integer.valueOf(words[1]);
            
                if(command.equals("add")){
                    first.add(value);
                }else if(command.equals("remove")){
                    second.remove(value);

                }else if(command.equals("move")){
                    
                    if(first.contains()>value){
                    second.add(value);
                    first.remove(value);
                    }else{
                        second.add(first.contains());
                        first.remove(value);
                    }
                }
            
            
        }
    }
}
