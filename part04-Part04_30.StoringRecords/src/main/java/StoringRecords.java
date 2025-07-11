
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        try(Scanner scanner=new Scanner(Paths.get(file))){
            while (scanner.hasNextLine()) {
                String info=scanner.nextLine();
                String words[]= info.split(",");
                Person n= new Person(words[0],Integer.valueOf(words[1]));
                persons.add(n);

            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        // Write here the code for reading from file
        // and printing the read records
        return persons;

    }
}
