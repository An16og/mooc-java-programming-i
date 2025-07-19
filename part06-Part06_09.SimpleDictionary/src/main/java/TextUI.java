import java.util.Scanner;

public class TextUI {
private Scanner scan;
private SimpleDictionary dictionary;

public TextUI(Scanner scan, SimpleDictionary dictionary){
    this.scan=scan;
    this.dictionary=dictionary;
}
public void start(){

    while (true) {
    System.out.println("Command: ");
    String command= scan.nextLine();


    if(command.equals("end")){
        System.out.println("Bye bye!");
        break;
    }else if(command.equals("add")){
        System.out.println("Word: ");
        String word=scan.nextLine();
        System.out.println("Translation: ");
        String translation= scan.nextLine();
        dictionary.add(word, translation);

    }else if(command.equals("search")){
        System.out.println("To be translated: ");
        String wor=scan.nextLine();
        String translation=dictionary.translate(wor);
        if(translation == null){
            System.out.println("Word "+wor+" was not found");
            }else{
            System.out.println("Translation: "+translation);
        }
        }else{
        System.out.println("Unknown command");
    }

    }
    }
}

