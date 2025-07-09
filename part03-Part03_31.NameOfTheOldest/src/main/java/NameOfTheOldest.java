
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp=0;
        String name=" ";
        while(true){
            String line=scanner.nextLine();
            if(line.equals("")){
                break;
            }
            String[] words=line.split(",");
            int age=Integer.valueOf(words[1]);
            if(age>temp){
            temp=age;
            name=words[0];

            }
            
        }
        System.out.println("Name of the oldest: "+name);

    }
}
