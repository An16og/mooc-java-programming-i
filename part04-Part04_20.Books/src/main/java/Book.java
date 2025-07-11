public class Book {
    private String name;
    private int publishYear;
    private int pageCount;

    public Book(String name,int pageCount,int publishYear ){
        this.name=name;
        this.publishYear=publishYear;
        this.pageCount=pageCount;

    }
    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return name+", "+pageCount+" pages, "+publishYear;
        
    }

}
