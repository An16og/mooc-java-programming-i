
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s=0;
        System.out.println("Last Number?");
        int last=Integer.valueOf(scanner.nextLine());

        //(You can also use while loop here)
        //while(i<=last){
        //s=s+i;
        //}
        for(int i=0;i<=last;i++){
            s =s+i;
        }
        System.out.println("The sum is "+s);



    }
}
