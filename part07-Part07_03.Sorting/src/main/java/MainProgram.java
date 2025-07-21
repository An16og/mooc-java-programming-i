import java.util.ArrayList;
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
 
      
    }
      public static int smallest(int[] array){
        int small= array[0];
        for(int i=0;i<array.length;i++){
            if(small>array[i]){
                small=array[i];
            }
        }
        return small;
    }
public static int indexOfSmallest(int[] array){
    // write your code here
    int smallindex= 0;
        for(int i=0;i<array.length;i++){
            if(array[smallindex]>array[i]){
                smallindex=i;
            }
        }
        return smallindex;


}
public static int indexOfSmallestFrom(int[] array, int smallindex){
        for(int i=smallindex;i<array.length;i++){
            if(array[smallindex]>array[i]){
                smallindex=i;
            }
        }
        return smallindex;
}
public static void swap(int[] array,int index1,int index2){
    int temp = array[index1];
    array[index1]=array[index2];
    array[index2]=temp;
}
public static void sort(int[]array){
    for(int i=0;i<array.length;i++){
        swap(array, i, indexOfSmallestFrom(array, i));
        System.out.println(Arrays.toString(array));

    }
}

}
