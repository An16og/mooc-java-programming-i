import java.util.ArrayList;

public class Room {
    private ArrayList<Person> list;
    public Room(){
        list=new ArrayList<>();
    }
    public void add(Person person){
        list.add(person);
    }
    public boolean isEmpty(){
        if(list.isEmpty()){
            return true;
        }
        return false;
    }
    public ArrayList<Person> getPersons(){
        return list;
    }
    public Person shortest(){
        Person shor= list.get(0);
        if(list.size()==0){
            return null;
        }
        for(Person peep:list){
            if(peep.getHeight()<shor.getHeight()){
                shor=peep;
            }
            
        }
        return shor;
    }
    public Person take(){
    Person shortest=shortest();
    if(shortest!=null){
        list.remove(shortest);}
        return shortest;
    }
}
