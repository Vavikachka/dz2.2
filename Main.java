import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Basket products = new Basket(new ArrayList<String>());   //корзина с товарами
        ArrayList<Double> prices = new ArrayList<>();   
        
        Consumer consumer = new Consumer ("Иван", 500.9, 10);
        Seller seller = new Seller ("Оля", 1000.01, 10);
        
        Item apple = new Item("яблоко",50.3);
        Item milk = new Item("молоко",100.3);

        System.out.println(apple.getnameOFItem() + " цена "+ apple.getCost());
        products.appendToNameOFItem(apple.getnameOFItem());
        products.appendToNameOFItem(milk.getnameOFItem());   //добавляем товар в корзину
        prices.add(apple.getCost());   //цены 
        prices.add(milk.getCost());
        System.out.println("Корзина: " + products.getProduct());
        System.out.println("сумма покупки "+ consumer.totalCost(prices));   
        
    }
       
}
