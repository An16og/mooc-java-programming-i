
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cou=0;
        while(true){
            System.out.println("Give a number:");
            int no=Integer.valueOf(scanner.nextLine());

            if(no==0){
                break;
            }else{
                cou=cou+1;
            }
            
        }
        System.out.println("Number of numbers: "+cou);

    }
}
