public class Film {
    private String name;
    private int ageRating;

    public Film(String filmname,int filmAgeRating){
        this.name=filmname;
        this.ageRating=filmAgeRating;
    }
    public String name(){
        return name;

    }
    public int ageRating(){
        return ageRating;
    }
}
