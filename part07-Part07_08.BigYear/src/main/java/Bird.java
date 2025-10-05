public class Bird {
    private String name;
    private String latiname;
    private int observation;

    public Bird(String name, String latiname){
        this.name=name;
        this.latiname=latiname;
        this.observation=0;
    }
    public void observe(){
        observation++;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        String s= name+" ("+latiname+"): "+observation+" observations";
        return s;
    }
}
