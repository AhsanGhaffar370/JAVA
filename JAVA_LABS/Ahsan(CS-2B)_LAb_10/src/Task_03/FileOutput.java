/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_03;

/**
 *
 * @author Ahsan Ghaffar
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
public class FileOutput 
{
    public static void main (String [] args) 
    {
        //Create an arraylist to store customers

        ArrayList<Account> customers = new ArrayList<Account>();
        //create some sample customers and add to list
        
        Account a = new Account ("123","Sam", 123.65);

        customers.add(a);

        a = new Account("234", "Sue", 423.35);

        customers.add(a);

        a = new Account("144", "Mark", 555.25);

        customers.add(a);
        
        //open a file
        Formatter output = null;

        //must open the file in a try catch block
        try 
        {

            output = new Formatter("data.txt");

        }
        
        catch (IOException e) 
        {

            System.out.println("There is an error - exiting");

            System.exit(1);

        }

        //write everything from list to output
        for (Account x: customers)
        {
            output.format("%s %s %.2f\n",x.getAcctNum(),x.getfName(),x.getBalance());
        }
        

        output.close();

    }
}

