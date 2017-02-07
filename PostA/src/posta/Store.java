/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posta;

/**
 *
 * @author Tony
 */
public class Store {
    private String name;
    private String address;
    public ProductCatalog pc;
    
    public Store(String name, String address){
        this.name = name;
        this.address = address;
    }
    public Store(){
        this.name = "Walmart";
        this.address = "100 Grove St.";
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
