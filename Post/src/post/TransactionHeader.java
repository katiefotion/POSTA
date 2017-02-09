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
public class TransactionHeader {
    public String storeName;
    public String customerName;
    public String time;
    
    public TransactionHeader(String storeName, String customerName, String time){
        this.storeName = storeName;
        this.customerName = customerName;
        this.time = time;
    }
    public String toString(){
        String header = "";
        header += storeName + "\n\n";
        header += customerName + "        " + time + "\n\n";
        return header;
    }
}
