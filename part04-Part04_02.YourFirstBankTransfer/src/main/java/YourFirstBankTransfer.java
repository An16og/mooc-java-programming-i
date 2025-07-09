
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account Matthews= new Account("Matthews account", 1000);
        Account My=new Account("My account", 0);
        Matthews.withdrawal(100);
        My.deposit(100);
        System.out.println(Matthews);
        System.out.println(My);
    }
}
