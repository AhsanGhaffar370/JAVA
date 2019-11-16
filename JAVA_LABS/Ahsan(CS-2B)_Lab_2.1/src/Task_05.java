/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan
 */
//Declaring Library to take inputs:
import java.util.Scanner;
public class Task_05 
{
    public static void main(String args[])
    {
        
        Scanner cin=new Scanner(System.in);
        
        //Declaring variables
        String Blood_type,choice;
        
         
        //Declare array to print the donor list of entered blood group:
        String arrD[][]={{"","","","","","","","",""},
                        {"O-","O+","A+","A-","B+","B-","AB+","AB-","-"},
                        {"O+","A+","B+","AB+","-","-","-","-","-"},
                        {"A-","AB-","AB+","-","-","-","-","-","-"},
                        {"A+","AB+","-","-","-","-","-","-","-"},
                        {"B-","AB-","AB+","-","-","-","-","-","-"},
                        {"B+","AB+","-","-","-","-","-","-","-"},
                        {"AB-","AB+","-","-","-","-","-","-","-"},
                        {"AB+","-","-","-","-","-","-","-","-"}};
    
        //Declare array to print the Receptor list of entered blood group:
        String arrR[][]={{"","","","","","","","",""},
                        {"O-","-","-","-","-","-","-","-","-"},
                        {"O+","O-","-","-","-","-","-","-","-"},
                        {"A-","O-","-","-","-","-","-","-","-"},
                        {"A+","O-","O+","A-","-","-","-","-","-"},
                        {"B-","O-","O+","B+","-","-","-","-","-"},
                        {"B+","O-","O+","B-","-","-","-","-","-"},
                        {"AB-","O-","A-","B-","-","-","-","-","-"},
                        {"AB+","O-","O+","A-","A+","B-","B+","AB-","-"}};
        
        //Use do while loop to repeat the code:
        do
        {
            //Taking input of blood type:
            System.out.print("\nEnter Blood Type: ");
        
            Blood_type=cin.nextLine();
            
            int index=0;
        
            /*Use Switch condition to compare the entered blood type then
            then print their Donors and Receiptors list:
             */
            switch (Blood_type) 
            {
            
                case "O-":
                {   
                    index=1;
                    
                    break;
                }
            
                case "O+":
                {  
                    index=2;
                    
                    break;
                }
            
                case "A-":
                {
                    index=3;
                    
                    break;
                }
            
                case "A+":
                {
                    index=4;
                    
                    break;
                }
            
                case "B-":
                { 
                    index=5;
                    
                    break; 
                }
            
                case "B+":
                {
                    index=6;
                    
                    break;
                }
                
                case "AB-":
                { 
                    index=7;
                    
                    break;
                }
            
                case "AB+":
                {
                    index=8;
                    
                    break; 
                }
                
                default:
                {
                    break;
                }
                
            }
            
            /*we use if condition when index=0
              because we have to initialize it so when we put any 
              string it prints first inde of array thats why  we 
              use if codition:
            */
            if (index==0)
            {
                
                System.out.println("\nPlease enter correct Blood type, Try again:");
                
                return;
                
            }
            
            else if(index==1 || index==2 || index==3 || index==4 || index==5 || index==6 || index==7 || index==8);
            {
            
                System.out.println("\n******************************************************************************");
                
                //Print O- blood group receiver list:
                
                System.out.print("The Blood Group '"+Blood_type+"' can Receive from: ");
           
                //Use for loop to print the Receiver list:
                
                for(int i=0;i<9;i++)
                {
               
                    System.out.print("["+arrR[index][i]+"],");
           
                }
            
                //Print O- blood group Donors list:
                
                System.out.print("\n\nThe Blood Group '"+Blood_type+"' can Donate to: ");
            
                //Use for loop to print the donors list:
                
                for(int i=0;i<9;i++)
                {
             
                    System.out.print("["+arrD[index][i]+"],");
            
                }
            
                System.out.println("\n******************************************************************************");
                
            }
        
            //Recieve input(Yes/NO) to enter Blood group again OR Exit the program:
            
            System.out.print("\nDo you want to continue to enter another Blood Group(y/n)? ");
       
            choice=cin.nextLine();
        
        }while(choice.equals("y"));//End of Do While loop:
    
    }//End Of Main:
   
}//End of Class:
