
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read:");
        try{
        String s=scanner.nextLine();
        Scanner scuu= new Scanner(new File(s));
        recipebook anuj= new recipebook(scuu);


        System.out.println("Commands:\n" + //
                        "list - lists the recipes\n" +
                        "stop - stops the program\n"
                        );

        while(true){
            System.out.println( "Enter command:");
        String comm=scanner.nextLine();
        if(comm.equals("list")){
            anuj.list();
        }
        else{
            break;
        }
    }
    }catch(Exception e){
        System.out.println(e);
    }
    }
}
 