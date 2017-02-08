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
public class Post {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProductReader pr = new ProductReader();
        pr.readFile("product_test1.txt");
        Store s = new Store("Walmart");
        s.setItems(pr.readFile("product_test1.txt"));
    }
    
}
