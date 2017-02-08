/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package post;
import java.text.*;
import java.util.*;
/**
 *
 * @author Jia Hu
 */
public class Store {
    public String name;
    public DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    public Date date = new Date();
    public ArrayList<Item> storeItems;
    
    public Store(String name){
        this.name = name;
    }
    
    public String getDate(){return dateFormat.format(date);}
    
    public void setItems(ArrayList<Item> si){
        storeItems = si;
    }
}
