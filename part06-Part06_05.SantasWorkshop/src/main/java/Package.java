import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> list;
    

    public Package(){
        list= new ArrayList<>();
    }
    public void addGift(Gift gift){
        list.add(gift);
    }
    public int totalWeight(){
        int total=0;
        for(Gift item:list){
            total=total+ item.getWeight();
        }
        return total;
    }

}
