import java.util.ArrayList;

// корзина
public class Basket {
    private ArrayList<String> product = new ArrayList<>();
    

    public Basket(ArrayList<String> product) {
        this.product = product;
    }

    public ArrayList<String> getProduct() {
        return product;
    }

    public void setProduct(ArrayList<String> product) {
        this.product = product;
    }

    public void appendToNameOFItem(String person){
        product.add(person);
    }

    public int size(){     //размер возращает
        return product.size();
    }

}
