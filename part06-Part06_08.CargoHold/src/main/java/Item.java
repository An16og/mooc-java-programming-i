public class Item {

    private String Name;
    private int weight;


    public Item(String Name,int weight){
        this.Name=Name;
        this.weight=weight;
    }
    public String getName(){
        return this.Name;
    }

    public int getWeight(){
        return this.weight;
    }

    public String toString(){
        String output= Name+"("+weight+" kg)";
        return output;
    }
    
}