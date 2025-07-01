
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;
        int sum=0;
        while(true){
            int a= Integer.valueOf(scanner.nextLine());

            if(a>0){
                count=count+1;
                sum=sum+a;

            }
            if(a==0){
                break;
            }

        }
        if(count==0){
            System.out.println("Cannot calculate the average");
        }else{
            System.out.println(sum*1.0/count);
        }
    }
}
