/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan Ghaffar
 */
import java.util.Scanner;
public class Task_02 
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int a; String rom = " ";
        System.out.print("Enter Number: ");
        a = cin.nextInt();
        
        System.out.print("\nThe entered number in Roman is: ");
        while(a>=1)
        {
            if(a>=1000) 
            {
                a = a - 1000;
                rom+="M";
            }
            
            else if(a>=999)
            { 
               a = a - 999; 
               rom+="IM";
            }
            
            else if(a>=900)
            {
                a = a - 900; 
                rom+="CM"; 
            }
            
            else if(a>=500)
            { 
                a = a - 500;
                rom+="D"; 
            } 
            
            else if(a>=400)
            {
                a = a - 400; 
                rom+="CD"; 
            }
            
            else if(a>=100) 
            {
                a = a - 100; 
                rom+="C"; 
            } 
            
            else if(a>=90) 
            {
                a = a - 90; 
                rom+="XC"; 
            }
            
            else if(a>=50) 
            { 
                a = a - 50; 
                rom+="L"; 
            } 
            
            else if(a>=40) 
            { 
                a = a - 40; 
                rom+="XL"; 
            }
            
            else if(a>=10) 
            { 
                a = a - 10; 
                rom+="X"; 
            } 
            
            else if(a>=9) 
            { 
                a = a - 9; 
                rom+="IX";
            } 
            
            else if(a>=8) 
            { 
                a = a - 8;
                rom+="VIII"; 
            }
           
            else if(a>=7) 
            {
                a =a - 7;
                rom+="VII"; 
            }
            
            else if(a>=6) 
            { 
                a = a - 6; 
                rom+="VI"; 
            }
            
            else if(a>=5) 
            { 
                a = a - 5; 
                rom+="V"; 
            }
            
            else if(a>=4) 
            {
                a = a - 4; 
                rom+="IV"; 
            } 
            
            else if(a>=3) 
            { 
                a = a - 3;
                rom+="III"; 
            }
            
            else if(a>=2)
            { 
                a = a - 2; 
                rom+="II"; 
            }
            
            else if(a>=1) 
            { 
                a = a - 1; 
                rom+="I"; 
            }
        } 
        
        System.out.println(rom);
    }    
}

