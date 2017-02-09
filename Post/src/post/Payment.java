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
public class Payment {
    private float amount;
    private String type;
    public Payment(float amount, String type){
        this.amount = amount;
        this.type = type;
    }
    
    public String getPaymentType(){return type;}
    
    public float getAmount(){return amount;}
    
    public void setPaymentType(String type){
        this.type = type;
    }
    public void setAmount(float amount){
        this.amount = amount;
    }
}

