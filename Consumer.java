// покупатель
import java.util.ArrayList; 
public class Consumer extends Human implements Communication{
    
    ArrayList<Item> wishList = new ArrayList<>();
    

    public Consumer(String name, double money, int loveIndex) {
        super(name, money, loveIndex);
    }
    
    // @Override

    // public double cosOfItem(Item item){
    //     System.out.println("Стоит "+item.getCost());
    //     return item.getCost();
    // }

    
}
