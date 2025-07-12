public class Book {
    private String Name;
    private String AuthorName;
    private int pageCount;


    public Book(String AuthorName,String Name,int pageCount){
        this.Name=Name;
        this.AuthorName=AuthorName;
        this.pageCount=pageCount;
    }
    public String getAuthor(){
        return AuthorName;
    }
    public String getName(){
        return Name;
    }
    public int getPages(){
        return pageCount;
    }
    public String toString(){
        return AuthorName+", "+Name+", "+pageCount+" pages";
    }


}
