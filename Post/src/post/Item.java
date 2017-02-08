/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package post;

/**
 *
 * @author Jia Hu
 */
public class Item {
    public String upc;
    public float price;
    public String description;
    
    public Item(String upc){
        this.upc = upc;
    }
    public Item(String upc, float price, String description){
        this.upc = upc;
        this.price = price;
        this.description = description;
    }
}
