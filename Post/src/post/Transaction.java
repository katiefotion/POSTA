/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package post;

/**
 *
 * @author Tony
 */
public class Transaction {
    public Customer customer;
    public String paymentType;
    public String storeName;
    public String date;
    public float total;
    public float tendered;
    public Transaction(Customer customer, String paymentType, String storeName, String date, float tendered){
        this.customer = customer;
        this.paymentType = paymentType;
        this.storeName = storeName;
        this.date = date;
        this.tendered = tendered;
    }
    public String toString(){
        String invoice = "";
        total = 0;
        invoice += storeName + "\n" + customer.name + "     " + date + "\n\n";
        for(int i = 0; i < customer.items.size(); i++){
            total += customer.items.get(i).price;
            invoice += customer.items.get(i).toString() + "         $"+ total + "\n";
        }
        invoice += "Total $" + total + "\n";
        invoice += "Amount Tendered " + paymentType + " $" + tendered + "\n";
        invoice += "Amount Returned $" + (tendered - total);
        return invoice;
    }
}
