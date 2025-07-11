public class Team {
    private String homeTeam;
    private String visitingTeam;
    private int homeTeamscore;
    private int visitingTeamscore;


    public Team(String home,String visitor,int homes,int visits){
        this.homeTeam=home;
        this.visitingTeam=visitor;
        this.homeTeamscore=homes;
        this.visitingTeamscore=visits;




    }
    public String getHomeTeam() {
    return this.homeTeam;
}

public String getVisitingTeam() {
    return this.visitingTeam;
}

public int getHomeTeamscore() {
    return this.homeTeamscore;
}

public int getVisitingTeamscore() {
    return this.visitingTeamscore;
}
}
