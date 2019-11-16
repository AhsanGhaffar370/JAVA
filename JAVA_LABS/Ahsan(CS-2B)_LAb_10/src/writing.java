
import java.io.File;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fall2017
 */
import java.util.*;
import java.io.*;
public class writing 
{
       public static void main(String[] args) 
    {
        PrintWriter out=null;
        try
        {
            out=new PrintWriter(new File("write.txt"));
        }
        catch(Exception e)
        {
            System.out.println(e);
                    
        }
        String n="ghaffar";

        out.println("Ahsan "+n);
        out.close();
    }
}
