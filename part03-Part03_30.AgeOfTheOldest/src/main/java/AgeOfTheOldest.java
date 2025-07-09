
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp=0;
        while (true) {
            String line=scanner.nextLine();
            if(line.equals("")){
                break;
            }
            String words[]=line.split(",");
            int age=Integer.valueOf(words[1]);
            if(age>temp){
                temp=age;
            }
            
        }
        System.out.println("Age of the oldest: "+temp);

    }
}
