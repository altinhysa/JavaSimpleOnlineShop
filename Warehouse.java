
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stock;
    
    public Warehouse(){
        prices = new HashMap<>();
        stock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        prices.put(product, price);
        this.stock.put(product, stock);
    }
    
    public int price(String product){
        return prices.getOrDefault(product, -99);
    }
    
    public int stock(String product){
        return stock.getOrDefault(product, 0);
    }
    
    public boolean take(String product){
        int currentStock = stock.getOrDefault(product, 0);
        if(currentStock > 0){
            currentStock--;
            stock.replace(product, currentStock);
            return true;
        }
        
        return false;
    }
    
    public Set<String> products(){
        return prices.keySet();
    }
}
