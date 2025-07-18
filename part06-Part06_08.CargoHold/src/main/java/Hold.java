import java.util.ArrayList;
public class Hold {
private int maxweight;
private ArrayList<Suitcase>Slist;

public Hold(int maxweight){
        this.maxweight=maxweight;
        Slist=new ArrayList<>();
        }
    public int totalSweight(){
        int Holdwt=0;
        for(Suitcase suit:Slist){
            Holdwt=Holdwt+suit.totalWeight();
        }
        return Holdwt;

    }
    public void addSuitcase(Suitcase suitcase){
        if(suitcase.totalWeight()+this.totalSweight()<=maxweight){
        Slist.add(suitcase);}
    }
    public void printItems(){
        for(Suitcase suit:Slist){
            suit.printItems();
        }
    }


    @Override
    public String toString(){
        return Slist.size()+" suitcases"+"("+totalSweight()+" kg)";
    }
    
}
