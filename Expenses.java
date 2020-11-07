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
public class Expenses 
{
    public String Name;
    private ArrayList<Payment> Array_Payment;
    
    public Expenses(String Name)
    {
        this.Name=Name;
        Array_Payment=new ArrayList<Payment>();
    }
    
    public CreditCardPayment addCardList(double am,String nm, String eDate, String num)
    {
        CreditCardPayment newCard = new CreditCardPayment(am,nm,eDate,num);
        Array_Payment.add(newCard);
        return null;
    }
    
    public CashPayment addCashList(double am)
    {
        CashPayment newCash = new CashPayment(am);
        Array_Payment.add(newCash);
        return null;
    }
    
    public String dAmount(double amt)
    {
        String amoun="";
        for(int a=0;a<Array_Payment.size();a++)
        {
            if(Array_Payment.get(a).getAmount()==amt||Array_Payment.get(a).getAmount()>amt)
            {
                amoun+=(a+1)+"."+Array_Payment.get(a).toString()+"\n";
            }
        }
        return amoun;
    }
    
    public String Typee(String x)
    {
        String amoun="";
        for(int a=0;a<Array_Payment.size();a++)
        {
            if(Array_Payment.get(a).toString().substring(0,1).equals(a))
            {
                amoun+=(a+1)+"."+Array_Payment.get(a).toString()+"\n";
            }
        }return amoun;
    }
    
    public String getTotalPay()
    {
        String amoun="";
        for(int a=0;a<Array_Payment.size();a++)
        {
            amoun+=(a+1)+"."+Array_Payment.get(a).toString()+"\n";
        }return amoun;
    }
    
    public int getNumPay()
    {
        return Array_Payment.size();
    }
    
    public double getTotalAmount()
    {
        double amoun=0;
        for(int a=0;a<Array_Payment.size();a++)
        {
            amoun+=Array_Payment.get(a).getAmount();
        }return amoun;
    }
}
