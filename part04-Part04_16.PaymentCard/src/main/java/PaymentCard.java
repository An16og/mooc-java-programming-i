public class PaymentCard{
    private double balance;

    public PaymentCard(double openingBalance){
        this.balance=openingBalance;

    }
    public String toString(){
        return  "The card has a balance of " + this.balance + " euros";

    }
    public void eatAffordably() {
    if(balance>=2.60){
        balance-=2.60;}

}

public void eatHeartily() {
    if(balance>=4.60){
        balance-=4.60;}

}
public void addMoney( double ammount){
    if(ammount>0){
    balance+=ammount;
    if (balance>150){
        balance=150;
    }
    }
}
}