import java.util.ArrayList;

public class List {
    private ArrayList<Integer>list;
    private int sum;
    

    public List(){
        list=new ArrayList<>();
        this.sum=0;
        
    }

    public void add(int number){
        if(number>=0&&number<=100){
            list.add(number);
        }
    }
    public double averagea(){
        for(int item:list){
            sum+=item;
        }
        double fin =sum*1.0/list.size();
        return fin;
    }
    public double averagep(){
        for(int item:list){
            if(item>=50){
            sum+=item;
            }
        }
        if(sum==0){
            return -;
        }
        double fin =sum*1.0/list.size();
        return fin;}
}
