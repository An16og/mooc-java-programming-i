
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList <Integer> list= new ArrayList<>();
        
        while (true) {
            int i= Integer.valueOf(scanner.nextLine());
            if(i==9999){
                break;
            }
            list.add(i);

            
        }
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int temp= list.get(0);
        for (int b=0;b<list.size();b++){
            if(list.get(b)<list.get(0)){
                temp=list.get(b);


            }
            System.out.println("Smallest number: "+temp);
            for(int a=0;a<list.size();a++){
                if(list.get(a)==temp){
                    System.out.println("Found at index: "+a);
                }
            }
        }

        
    }
}
