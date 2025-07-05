
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        ArrayList<Integer> list=new ArrayList<>();
        while(true){
          int a=Integer.valueOf(scanner.nextLine());
          if(a==-1){
            break;
          }
          list.add(a);

        }

        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        int sum =0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);

        }
        double a=sum*1.0/list.size();
        // and prints it.
        System.out.println("Average:"+a);
        
    }
}
