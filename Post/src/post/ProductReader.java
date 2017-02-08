/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package post;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Tony
 */
public class ProductReader {
    private Scanner x;
    public void readFile(String productFile){
        try{
            x = new Scanner(new File(productFile));
            System.out.println("File identified");
            while(x.hasNext()){
                String line = x.nextLine();
                
                String upc = line.substring(0, 4);
                
                String description = line.substring(10, 29);
                
                int price = Integer.parseInt(line.substring(35));
                
                
                System.out.println(upc + " " + description + " " + price + " ");
            }
            x.close();
        }
        catch(Exception e){
            System.out.println("There was an error");
        }
    }
}
