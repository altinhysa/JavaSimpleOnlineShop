
import java.util.ArrayList;
import java.util.List;


public class ShoppingCart {
    private List<Item> items;
    
    public ShoppingCart(){
        items = new ArrayList<>();
    }
    
    public void add(String product, int price){
        
        Item newItem = new Item(product, 1, price);
        if(items.contains(newItem)){
            int index = items.indexOf(newItem);
            items.get(index).increaseQuantity();
        }else {
            items.add(newItem);

        }
    }
    
    public int price(){
        int total = 0;
        for(Item item : items){
            total += item.price();
        }
        
        return total;
    }
    
    public void print(){
        for(Item item : items){
            System.out.println(item);
        }
    }
}
