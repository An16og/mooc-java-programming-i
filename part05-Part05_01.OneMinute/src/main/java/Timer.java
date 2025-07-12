public class Timer{
    private ClockHand  hundredthsOfASecond;
    private ClockHand seconds;

    public Timer(){
        this.hundredthsOfASecond = new ClockHand(100);
        this.seconds= new ClockHand(60);

    }
    public void advance(){
        hundredthsOfASecond.advance();

        if (hundredthsOfASecond.value()==0) {
            seconds.advance();
            
        }
     
    } 
        public String toString() {
        return seconds + ":" + hundredthsOfASecond;
    }
}        