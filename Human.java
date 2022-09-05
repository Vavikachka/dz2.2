
public abstract class Human implements Communication {
    private String name;
    private double money;
    private double loveIndex;
    
    public Human(String name, double money, int loveIndex){
        this.name = name;
        this.money = money;
        this.loveIndex = loveIndex;
    }  
     
    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public double getMoney(){
        return money;
    }



    
}