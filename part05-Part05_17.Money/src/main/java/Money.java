
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    public Money plus(Money addition){
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        
        return newMoney;
    }
    public boolean lessThan(Money compared){
        if(this.euros>compared.euros){
            return false;

        }else if(this.euros==compared.euros){
            if (this.cents>compared.cents) {
                return false;
            }

        }
        return true;

    }

    public Money minus(Money decreaser){
        int deeuro=this.euros - decreaser.euros;
        int decent= this.cents - decreaser.cents;
        if(deeuro>=0){
            if(decent<0){
            deeuro-=1;
            decent+=100;}
        }else{
            deeuro=0;
            decent=0;
        }
        Money newMoney= new Money(deeuro, decent);
        
        return newMoney;
    }

}
