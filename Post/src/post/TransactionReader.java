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
    public Transaction transaction;
    public Transaction readFile(String transactionFile, Store store){
        try{
            Customer customer = new Customer();
            String name = "";
            String paymentType = "";
            float amount = 0;
            x = new Scanner(new File(transactionFile));
            if(x.hasNext()){
                name = x.nextLine();
                customer.name = name;
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
                    for(int i = 0; i< quantity; i++){
                        for(int j = 0; j <store.storeItems.size(); j++ ){
                            if(store.storeItems.get(j).upc.equals(upc)){
                                customer.addItem(store.storeItems.get(j));
                            }
                        }

                    }
                    //System.out.println(quantity);
                }
                else{
                    
                    
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
            transaction = new Transaction(customer,paymentType,store.getName(), store.getDate(), amount);
            x.close();
        }
        catch(Exception e){
            System.out.println("There was an error");
        }
        return transaction;
    }
}
