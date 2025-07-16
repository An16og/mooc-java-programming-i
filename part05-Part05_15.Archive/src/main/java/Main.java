
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Product> items=new ArrayList<>();
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String Identifier=scanner.nextLine();
            if(Identifier.isEmpty()){
                break;
            }
        
        System.out.println("Name? (empty will stop)");
            String name=scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
        Product blck= new Product(Identifier, name);
        boolean same=false;
        for (Product item:items){
            if(item.compared(blck)){
                same=true;
            }
        }
        if(same){
            break;
        }else{
            items.add(blck);
        }
        
        
        }
        System.out.println("==Items==");
        for(Product item:items){
            System.out.println(item);
        }
        



    
    }
}

