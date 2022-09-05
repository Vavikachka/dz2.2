import java.util.Locale.Category;

public class Item {
    private String nameOfItem;
    private double cost;
    private Category category;

    public Item(String nameOFItem, double cost){
        this.nameOfItem = nameOFItem;
        this.cost = cost;
        // this.category = categore;
    }
    

    public String getnameOFItem(){
        return nameOfItem;
    }

    public void setnameOFItem(String nameOFItem){
        this.nameOfItem = nameOFItem;
    }

    public double getCost(){
        return cost;
    }
    
    public void setCost(double cost){
        this.cost = cost;
    }

    public Category getcategory(){
        return category;
    }

    public void setcategory(Category category){
        this.category = category;
    }

}
