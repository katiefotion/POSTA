/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package post;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tony
 */
public class TransactionReader {
    private Scanner x;
    public void readFile(String transactionFile){
        try{
            x = new Scanner(new File(transactionFile));
            if(x.hasNext()){
                String customer = x.nextLine();
                //System.out.println(customer);
            }
            while(x.hasNext()){
                String itemLine = x.nextLine();
                //System.out.println(itemLine);
                if(!itemLine.startsWith("CASH") && !itemLine.startsWith("CREDIT") && !itemLine.startsWith("Check")){
                    String upc = itemLine.substring(0, 4);
                    //System.out.println(upc);
                    int quantity = 1;
                    if(itemLine.length() > 10)
                        quantity = Integer.parseInt(itemLine.substring(10));
                    //System.out.println(quantity);
                }
                else{
                    String paymentType = "";
                    float amount = 0;
                    if(itemLine.startsWith("CASH")){
                        paymentType = "cash";
                        amount = Float.valueOf(itemLine.substring(6));
                    }
                    else if(itemLine.startsWith("CREDIT")){
                        paymentType = "credit";
                    }
                    else if(itemLine.startsWith("CHECK")){
                        paymentType = "check";
                    }
                    //System.out.println(paymentType);
                    //System.out.println(amount);
                }
            }
            x.close();
            
        }
        catch(Exception e){
            System.out.println("There was an error");
        }
        
    }
}
