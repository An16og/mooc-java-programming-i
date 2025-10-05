import java.util.ArrayList;

public class recipe {
    private String name;
    private String cookingtime;
    private ArrayList<String> ingredient;

    public recipe(String name,String cookingtime,ArrayList ingredient){
        this.name=name;
        this.cookingtime=cookingtime;
        this.ingredient=ingredient;
    }
    public String getname(){
        return name;
    }
    public String gettime(){
        return cookingtime;
    }
    public ArrayList<String> geting(){
        return ingredient;
    }
}