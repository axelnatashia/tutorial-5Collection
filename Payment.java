/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial5;
import java.util.*;
/**
 *
 * @author AXEL NATASHIA JAYA
 * E1700859
 */
public class Payment 
{
    private double amount;
    
    public Payment()
    {
        this.amount=0;
    }
    
    public Payment(double am)
    {
        this.amount=am;
    }
    
    public void setAmount(double am)
    {
        amount=am;
    }
    public double getAmount()
    {
        return amount;
    }
    
    public String toString()
    {
        return "amount paid is: "+getAmount();
    }
}
