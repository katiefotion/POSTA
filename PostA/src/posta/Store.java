/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posta;
import java.text.*;
import java.util.*;
/**
 *
 * @author Tony
 */
public class Store {
    private String name;
    private String address;
    public ProductCatalog pc;
    public DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    public Date date = new Date();
    
    public Store(String name, String address){
        this.name = name;
        this.address = address;
    }
    public Store(){
        this.name = "Walmart";
        this.address = "100 Grove St.";
    }
    
    public String getDate(){return dateFormat.format(date);}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
