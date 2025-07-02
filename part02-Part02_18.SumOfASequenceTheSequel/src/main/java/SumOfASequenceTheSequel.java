
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s=0;
        System.out.println("First Number?");
        int first=Integer.valueOf(scanner.nextLine());
        System.out.println("Last Number?");
        int last=Integer.valueOf(scanner.nextLine());

       
        for(int i=first;i<=last;i++){
            s =s+i;
        }
        System.out.println("The sum is "+s);



    }
}

    