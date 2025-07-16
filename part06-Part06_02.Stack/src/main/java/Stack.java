import java.util.ArrayList;

public class Stack {
    private ArrayList <String> stack;


    public Stack(){
        this.stack= new ArrayList<>();

    }
    public boolean isEmpty() {
        if (stack.isEmpty()){
            return true;
        }
        return false;
    }

public void add(String value){
    for(String item:stack){
        if (item.equals(value)){
            break;
        }
    }
    stack.add(value);
}
public String take(){
    String i=stack.get(stack.size()-1);
    stack.remove(i);
    return i;
}



public ArrayList<String> values(){
 return stack;
}
}