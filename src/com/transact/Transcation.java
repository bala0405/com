package com.transact;
public class Transcation
{

    private static int balance =0;
    public static void credit(int amt)
    {
        balance += amt;
        System.out.println("Amount Credited : "+ amt);
        System.out.println("Balance :"+ balance);
    }
    public static void debit(int amt)
    {
        if(amt  <=  balance)
        {
            balance -= amt;
            System.out.println("Amount Debited : "+ amt);
            System.out.println("Balance :"+ balance);
        }
        else
        {
            System.out.println("Low Balance!!!!\n BAlance :"+balance);
        }
    }
}
