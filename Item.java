/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TiniGonaXheni
 */
public class Item {
    private String product;
    private int qty;
    private int unitPrice;
    
    public Item(String product, int qty, int unitPrice){
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    
    public int price(){
        return qty * unitPrice;
    }
    
    public void increaseQuantity(){
        qty++;
    }
    public String toString(){
        return product + ": " + qty;
    }
    
    public boolean equals(Object other){
        if(this == other){
            return true;
        }
        
        if(!(other instanceof Item)){
            return false;
        }
        
        Item compared = (Item) other;
        
        if(this.product.equals(compared.product)
           && this.unitPrice == compared.unitPrice){
            
            return true;
        }
        
        
        return false;
    }
    
    public int hashCode(){
        if(this.product == null){
            return this.unitPrice;
        }
        
        return this.product.hashCode() + unitPrice;
    }
}
