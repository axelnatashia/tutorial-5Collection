/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial5;

/**
 *
 * @author AXEL NATASHIA JAYA
 * E1700859
 */
public class CashPayment extends Payment
{
    public CashPayment(double am)
    {
        super(am);
    }
    
    public String toString()
    {
        return "The amount payment with Cash "+super.getAmount();
    }
}
