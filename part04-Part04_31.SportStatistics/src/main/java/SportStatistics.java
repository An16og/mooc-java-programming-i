
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        int count=0;
        int win=0;
        int loss=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        ArrayList <Team> scores= new ArrayList<>();
        String file=scan.nextLine();
        try(Scanner scanner=new Scanner(Paths.get(file))){
            while (scanner.hasNextLine()) {
                String match=scanner.nextLine();
                String[] person=match.split(",");
                Team mem=new Team(person[0], person[1], Integer.valueOf(person[2]), Integer.valueOf(person[3]));
                scores.add(mem);
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Team: ");
        String query= scan.nextLine();
        for(Team match:scores){
        if(match.getHomeTeam().equals(query)){
            count++;
            if(match.getHomeTeamscore()>match.getVisitingTeamscore()){
            win++;

            }
            else{
                loss++;
            }

        }
        if(match.getVisitingTeam().equals(query)){
            count++;
            if(match.getHomeTeamscore()>match.getVisitingTeamscore()){
            loss++;

            }
            else{
                win++;
            }
            
        }
    }
    System.out.println("Games: "+count);
    System.out.println("Wins: "+win);
    System.out.println("Losses: "+loss);


}
    }


