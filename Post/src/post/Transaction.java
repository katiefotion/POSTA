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
public class Transaction {
    public Customer customer;
    public Payment payment;
    public String storeName;
    public String date;
    public float total;
    public TransactionHeader th;
    public Transaction(Customer customer, String storeName, String date, Payment payment){
        this.customer = customer;
        this.payment = payment;
        this.storeName = storeName;
        this.date = date;
    }
    public String toString(){
        String invoice = "";
        total = 0;
        th = new TransactionHeader(storeName,customer.name,date);
        invoice += th.toString();
        for(int i = 0; i < customer.items.size(); i++){
            total += customer.items.get(i).price;
            invoice += customer.items.get(i).toString() + "         $"+ total + "\n";
        }
        invoice += "Total $" + total + "\n";
        invoice += "Amount Tendered " + payment.getPaymentType() + " $" + payment.getAmount() + "\n";
        invoice += "Amount Returned $" + (payment.getAmount() - total);
        return invoice;
    }
}
