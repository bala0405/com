package com.loan;
import java.util.Scanner;
import com.transact.Transcation;

public class LoanAccount
{
    int ch;
    Scanner sc;
    public LoanAccount()
    {
         sc = new Scanner(System.in);

    }


    public void  doTransaction(int amt)
    {
        System.out.println("1.CREDIT OR 2.DEBIT ?????");
        ch = sc.nextInt();
        if(ch == 1)
        {
            Transcation.credit(amt);
        }
        else if (ch == 2)
        {
            Transcation.debit(amt);
        }

    }

}
