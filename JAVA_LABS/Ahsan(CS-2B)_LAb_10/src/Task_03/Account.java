package Task_03;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan Ghaffar
 */
public class Account 
{
    private String acctNum;

    private String fName;

    private double balance;

 
    public Account (String num, String name, double bal) {

        acctNum = num;

        fName = name;

        balance = bal;

    }

    public String getAcctNum() {

        return acctNum;

    }

    public void setAcctNum(String acctNum) {

        this.acctNum = acctNum;

    }

    public String getfName() {

        
        return fName;

    }

    public void setfName(String fName) {

        this.fName = fName;

    }

    public double getBalance() {

        return balance;

    }

    public void setBalance(double balance) {

        this.balance = balance;

    }
    
    public String toString() 
    {
        return "Account Number ="+ acctNum + "\nFirst Name= " + fName+ "\nBalance = " + balance;
    }
}
