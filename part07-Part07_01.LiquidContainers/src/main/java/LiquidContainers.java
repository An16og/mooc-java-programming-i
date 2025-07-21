
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int container1=0,container2=0;



        while (true) {
            System.out.print("First:"+container1+"/100\n" + //
                                "Second:"+container2+"/100\n");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] words= input.split(" ");
            String command =words[0];
            int value=Integer.valueOf(words[1]);
            if(value>0){
                if(command.equals("add")){
                    if(container1+value<=100){
                        container1+=value;
                    }else{
                        container1=100;
                    }
                }
                if(command.equals("remove")){
                    if(container2-value>=0){
                        container2-=value;
                    }else{
                        container2=0;
                    }

                }
                if(command.equals("move")){
                    if(container1>=value){
                        container1-=value;
                        container2+=value;
                    }else{
                        container2+=container1;
                    }
                    if(container2>=100){
                        container2=100;
                    }

            }
            

        }
    }

}
}
