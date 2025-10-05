
import java.util.Scanner;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        ArrayList<Bird> book= new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while(true){
        System.out.print("?");
        String comm=scan.nextLine();
        if(comm.equals("Add")){
            System.out.println("Name: ");
            String name=scan.nextLine();
            System.out.println("Name in Latin: ");
            String latiname= scan.nextLine();
            Bird b= new Bird(name, latiname);
            book.add(b);
        }else if(comm.equals("Observation")){
            System.out.print("Bird? ");
            String find= scan.nextLine();
            boolean found=false;
            for(Bird blu:book){
                if(blu.getName().equals(find)){
                    blu.observe();
                    found=true;
                    break;
                }}
                if(!found){
                    System.out.println("Not a bird!");
                }
            
            
        }else if(comm.equals("All")){
            for(Bird b:book){
                System.out.println(b);
            }
        }else if(comm.equals("One")){
            System.out.print("Bird? ");
            String find= scan.nextLine();
            boolean found=false;
            for(Bird blu:book){
                if(blu.getName().equals(find)){
                    System.out.println(blu);;
                    found=true;
                    break;
                }}
                if(!found){
                    System.out.println("Not a bird!");
                }
        }else if(comm.equals("Quit")){
            break;
        }
    }
    


    }

}
 