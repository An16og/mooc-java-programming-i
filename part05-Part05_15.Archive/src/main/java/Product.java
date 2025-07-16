public class Product {
    private String Identifier;
    private String name;

    public Product(String Identifier,String name){
        this.Identifier=Identifier;
        this.name=name;
    }

public String getname(){
return this.name;

}
public void setname(String name){
    this.name=name;
}
public String getIdentifier(){
    return this.Identifier;
}
public void setIdentifier(String Identifier){
    this.Identifier=Identifier;
}
public Boolean compared(Product comp){
    boolean result=false;
    if(this.Identifier.equals(comp.Identifier)){
    result=true;}
    return result;
}
@Override
public String toString(){
    return (Identifier+": "+name);
}



}
