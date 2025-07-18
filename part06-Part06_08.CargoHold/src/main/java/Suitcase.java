import java.util.ArrayList;

public class Suitcase {
    private ArrayList <Item>list;
    private int maxweight;

    public Suitcase(int maxweight){
        this.list=new ArrayList<>();
        this.maxweight=maxweight;
    }
    public int totalWeight(){
        int weightofSuitcase=0;
        for(Item it:list){
            weightofSuitcase=weightofSuitcase+it.getWeight();
        }
        return weightofSuitcase;
    }

    public void addItem(Item item){
        if(totalWeight()+item.getWeight()<=maxweight){
        list.add(item);}

    }
    public void printItems(){
        for(Item it:list){
            System.out.println(it);
        }
    }
    public Item heaviestItem(){
        if(list.isEmpty()){
            return null;
        }
        Item heaviest= list.get(1);
        for(Item it:list){
            if(it.getWeight()>heaviest.getWeight()){
                heaviest=it;
            }
        }
        return heaviest;

    }


    @Override
    public String toString(){
        String Part1;
        if(list.size()==0){
            Part1 ="no items";
        }
        else if (list.size()==1) {
            Part1=list.size()+" item";
        }else{
            Part1=list.size()+" items";
        }
        return Part1+"("+totalWeight()+"kg )";

    }


}
