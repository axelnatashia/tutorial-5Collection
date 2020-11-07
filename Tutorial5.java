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
public class Tutorial5 {

    /**
     * @param args the command line arguments
     */
    private static Scanner key;
    public static void main(String[] args) {
        // TODO code application logic here
        Expenses newExp=new Expenses("Axel");
        key=new Scanner(System.in);
        int choose;
        int newchoose;
        double am;
        String nm;
        String eDate;
        String num;
        String type;
        do{
            System.out.println("1. Add new Payment");
            System.out.println("2. Display Payment>= Amount Entered");
            System.out.println("3. Display Payments, of specific payment type");
            System.out.println("4. Display Summary Information");
            System.out.println("5. Display Payments");
            System.out.println("6. Quit");
            
            choose=key.nextInt();
            
            if(choose==1)
            {
                System.out.println("1. Cash");
                System.out.println("2. Credit Card");
                newchoose=key.nextInt();
                if(newchoose==1)
                {
                    System.out.println("Enter Amount: ");
                    am=key.nextDouble();
                    newExp.addCashList(am);
                }
                if(newchoose==2)
                {
                    System.out.println("Enter Amount: ");
                    am=key.nextDouble();
                    System.out.println("Enter Name: ");
                    nm=key.next();
                    System.out.println("Enter Expire Date: ");
                    eDate=key.next();
                    System.out.println("Enter Card Number: ");
                    num=key.next();
                    newExp.addCardList(am,nm,eDate,num);
                }
            }
            if(choose==2)
            {
                System.out.println("Enter amount to search: ");
                am=key.nextDouble();
                System.out.println(newExp.dAmount(am));
            }
            if(choose==3)
            {
                System.out.println("Enter the type pf payment Cash/Card: ");
                type=key.next();
                if(type.equals("Cash"))
                {
                    type="A";
                    System.out.println(newExp.Typee(type));   
                }
                if(type.equals("Card"))
                {
                    type="B";
                    System.out.println(newExp.Typee(type));
                }
            }
            if(choose==4)
            {
                System.out.println("Summary Information of Payment in Expenses");
                System.out.print("Number of Payment: ");
                System.out.println(newExp.getNumPay());
                System.out.print("Total amount of Payment: ");
                System.out.println(newExp.getTotalAmount());
            }
            if(choose==5)
            {
                System.out.println(newExp.getTotalPay());
            }
        }
        while(choose !=6);
    }
    
}
