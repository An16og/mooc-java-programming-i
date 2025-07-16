
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    public String toString(){
        int size=elements.size();
        String printValue="";
        for(String element:elements){
            if (size>1)
            {printValue=printValue+element+"\n";}
            else if(size==1){
                printValue=element;
            }
        }
        String part1 ="The collection "+this.name;
        if(size==0){
            part1=part1+" is empty.";
        }else if(size==1){
            part1=part1+" has "+size+" element:\n"+printValue;
        }else{
            part1=part1+" has "+size+" elements:\n"+printValue;
        }
    return part1;
    
}
}
