public class Container {
    private int ammount;
    


    public Container(){
        this.ammount=0;
        
    }
    
    public int contains(){
        return ammount;
    }
    public void add(int amount){
        if(amount>0){
        ammount+=amount;
        if(ammount>=100){
            ammount=100;
        }
    }
    }
    public void remove(int amount){
        if(amount>0){
        if(amount>ammount){
            ammount=0;
        }else{
            ammount-=amount;
        }
    }
    }
    public String toString(){
        String volume = ammount+"/100";
        return volume;
    }


         }
