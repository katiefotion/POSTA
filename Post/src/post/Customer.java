/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package post;

import java.util.*;

/**
 *
 * @author Jia Hu
 */
public class Customer {
    public String name;
    public Vector<Item> items = new Vector<Item>();
    
    public Customer(String name){this.name = name;}    
    
    public void addItem(Item item){items.add(item);}    
    
    public void removeItem(Item item){items.remove(item);}    
}
