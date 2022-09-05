import java.util.List;
import java.util.ArrayList;
public interface Communication {
    default double cosOfItem(Item item){     //спрашивают сколько стоит и отвечают.
        System.out.println("Стоит "+ item.getCost());
        return item.getCost();
    }
    
    default void isItemsInStorage(Seller seller, List<Item> wishListOfConsumer){     //наличие товар
        for (Item item : wishListOfConsumer) {
            if(!seller.getItem().contains(item)){
                System.out.println("у нас нет" + item.getnameOFItem());
            }
        }
    } 

    default double totalCost(ArrayList<Double> prices){   //стоймость всех покупок 
        double result = 0;
        for (int i = 0; i < prices.size(); i++) {
            result+=prices.get(i);
        }
        return result;
    }
    

    default void areYouPoor (Consumer consumer, ArrayList<Double> prices){
        if(totalCost(prices) > consumer.getMoney()){
            System.out.println("у тебя нет денег");
        }
        else{
            walkInStorage();
        }
    }

    default void walkInStorage(){
        System.out.println("Продавец пошел за товаром на склад");
    }
}


