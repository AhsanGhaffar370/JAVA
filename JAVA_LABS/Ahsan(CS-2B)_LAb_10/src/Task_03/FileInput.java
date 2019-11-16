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
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class FileInput 
{

    public static void main (String [] args) 
    {

//List to put the objects we&#39;re going to read from the file

        ArrayList<Account> list = new ArrayList<Account>();
//We&#39;ll use a scanner object to read from the file.
//Are there other ways? Of course...
        Scanner s = null;

        try 
        {

            s = new Scanner (new File("data.txt"));

        }
        catch (IOException e) 
        {

            System.out.println("Error opening file");

            System.exit(1);

        }
//Temp variables to store values read from file

        String aNum, fName;

        double bal;


        while (s.hasNext())
        {
//aNum = s.next();
//fName = s.next();
//bal = s.nextDouble();
//Account a = new Account(aNum, fName, bal);

            Account a = new Account(s.next(),s.next(), s.nextDouble());

            list.add(a);

        }

//print the customers out

        for(Account x: list)

            System.out.println(x);


    }
    

}
