import com.loan.LoanAccount;

import java.sql.SQLOutput;

public class driver
{
    public static void main(String args[]) {
        LoanAccount lb = new LoanAccount();
        System.out.println("Banking System");
        for (String i : args)
        {
            int var;
            var = Integer.parseInt(i);
            System.out.println("Amount : "+var);
            lb.doTransaction(var);
        }
    }
}
