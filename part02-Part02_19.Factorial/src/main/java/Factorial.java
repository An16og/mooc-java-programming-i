
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s=1;
        System.out.println("Last Number?");
        int last=Integer.valueOf(scanner.nextLine());

        //(You can also use while loop here)
        //while(i<=last){
        //s=s+i;
        //}
        for(int i=1;i<=last;i++){
            s =s*i;
        }
        System.out.println("Factorial: "+s);

    }
}
