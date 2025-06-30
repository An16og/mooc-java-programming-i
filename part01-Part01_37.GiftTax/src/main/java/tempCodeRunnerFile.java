
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int val= Integer.valueOf(scan.nextLine());

        if(val>1000000){
            double ta=142100 + (val-1000000)*0.17;
            System.out.println(ta);
        }else if(val>200000){
            double ta=22 100 + (val-200000)*0.15;
            System.out.println(ta);
        }else if(val>55000){
            double ta=4700 + (val-55000)*0.12;
            System.out.println(ta);
        }else if(val>25000){
            double ta=1700 + (val-25000)*0.10;
            System.out.println(ta);
        }else if(val>5000){
            double ta=100 + (val-5000)*0.08;
            System.out.println(ta);
        } else{
            System.out.println("No tax!");
        }

    }
}
