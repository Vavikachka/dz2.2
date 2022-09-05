// продавец
import java.util.ArrayList;
import java.util.List;

public class Seller extends Human {
    private List<Item> item = new ArrayList<>();

    public Seller(String name, double money, int loveIndex){
        super(name, money, loveIndex);
    }

    public List<Item> getItem(){
        return item;
    }
}
