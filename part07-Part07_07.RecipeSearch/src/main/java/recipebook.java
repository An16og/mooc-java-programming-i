import java.util.ArrayList;
import java.util.Scanner;
public class recipebook {
    private Scanner scan;

    public recipebook(Scanner scii){
        this.scan=scii;
    }
    public ArrayList<recipe> book(){
        ArrayList<recipe> lilu= new ArrayList<>();
        while (scan.hasNextLine()) {
            
                String name= scan.nextLine();
                String time= scan.nextLine();
                ArrayList<String> ing= new ArrayList<>();
                while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if (line.equals("")) break;
                ing.add(line);}


                recipe r = new recipe(name, time, ing);
                lilu.add(r);

            
            
        }
        return lilu;
    }
    public void list(){
        for(recipe food:book()){
            System.out.println(food.getname()+", cooking time: "+food.gettime());
        }
    }
}
