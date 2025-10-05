
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
                        "stop - stops the program\n"+
                        "find name - searches recipes by name\n"+
                        "find cooking time - searches recipes by cooking time\n"+
                        "find ingredient - searches recipes by ingredient\n"
                        );

        while(true){
            System.out.println( "Enter command:");
        String comm=scanner.nextLine();
        if(comm.equals("list")){
            anuj.list();
        }else if(comm.equals("find name")){
            System.out.println("Searched word: ");
            String word= scanner.nextLine();
            anuj.find(word);

        }else if(comm.equals("find cooking time")){
                System.out.println("Max cooking time: ");
                int tim=Integer.valueOf(scanner.nextLine());
                anuj.findti(tim);

        }else if(comm.equals("find ingredient")){
                System.out.println("Ingredient: ");
                String ingi=scanner.nextLine();
                anuj.findin(ingi);

        }else{
            break;
                }
    }
    }catch(Exception e){
        System.out.println(e);
    }
    }
}
 