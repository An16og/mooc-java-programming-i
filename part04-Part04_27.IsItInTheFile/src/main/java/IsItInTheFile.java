
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean found=false;

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        try(Scanner scan= new Scanner(Paths.get(file))){
            while(scan.hasNextLine()){
                if (searchedFor.equals(scan.nextLine())) {
                    found=true;
                    break;
                }

            }
        } catch(Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }
        if (found) {
            System.out.println("Found!");
        }else{System.out.println("Not found.");}



    }
}
