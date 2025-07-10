public class Product{
    private String name;   
    private int quantity;
    private double price;

    public Product(String initialName, double initialPrice, int quantity){
        this.name=initialName;
        this.quantity=quantity;
        this.price=initialPrice;
    }

    public void printProduct(){
        System.out.println(name+", price "+price+", "+quantity+" pcs");
    }
}