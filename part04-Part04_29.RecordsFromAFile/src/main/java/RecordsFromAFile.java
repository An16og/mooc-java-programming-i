
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String file= scanner.nextLine();
        try(Scanner scan= new Scanner(Paths.get(file))){
        while(scan.hasNextLine()){
        String Words[]=scan.nextLine().split(",");
        System.out.println(Words[0]+", age: "+Words[1]+" years");
        }}
        catch(Exception e){
            System.out.println(e);
        }

    }
}
