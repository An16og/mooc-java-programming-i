
import java.util.ArrayList;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("First name: ");
            String firstname= scanner.nextLine();
            if(firstname.equals("")){
                break;
            }
            System.out.println("Last name: ");
            String lastname=scanner.nextLine();
            System.out.println("Identification number: ");
            String identificationnumber= scanner.nextLine();
            infoCollection.add(new PersonalInformation(firstname, lastname, identificationnumber));
            
        }
        for(PersonalInformation Info:infoCollection){
            System.out.println(Info.getFirstName()+" "+Info.getLastName());
        }

    }
}
