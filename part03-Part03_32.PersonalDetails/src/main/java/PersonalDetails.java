
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name="";
        int temp=0;
        int sumofage=0;
        while(true){
            String line=scanner.nextLine();
            if(line.equals("")){
                break;
            }
            String[] words=line.split(",");
            sumofage+=Integer.valueOf(words[1]);
            temp++;

            if(words[0].length()>name.length()){
                name=words[0];

            }
        }
        Double average=sumofage*1.0/temp;
        System.out.println("Longest name: "+name);
        System.out.println("Average of the birth years: "+average);

    }
}
