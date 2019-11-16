package Task_03;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Ward 
{
    private String wardname;
    private Patient []arPatient=new Patient[100];
    private int nbp;
    
   public Ward(String name)
   {
       wardname=name;
    
       nbp=0;
   }
   
   public String getwardname()
   {
      return wardname;
   }
   
   public void addPatient(Patient p)
   {
       if(nbp<=100)
       {
           arPatient[nbp]=p;
           nbp++;
       }
       
       else
       {
           System.out.println("Not Enough space left");
       }
   }
   public void searchPatient(int patid)
   {
       int i;
       for(i=0;i<nbp;i++)
       {
           if(arPatient[i].getpatid()==patid)
           {
               System.out.println("Patient Founded");
       
               System.out.println("*************************************");
      
               arPatient[i].displayAll(); 
      
               System.out.println("*************************************");
       
               break;
           }
     
           if(arPatient[i].getpatid()!=patid)
           {
               System.out.println("Patient Not Founded");
           }
       }
   }
   
   public void deletePatient(int patid)
   {
       int i;
    
       for(i=0;i<nbp;i++)
       {
           if(arPatient[i].getpatid()==patid)
           { 
               break;
           }
       }
   
       if(arPatient[i].getpatid()==patid)
       {
           for(int j=i;j<nbp;j++)
           {
               arPatient[j]=arPatient[j+1];   
           }
           System.out.println("ID: "+patid+" Patient Deleted");
    
           nbp--;
       }
   
       else
       {
           System.out.println("ID: "+patid+" Patient not Founded");
    
       }
   }
 
   public void displayAll()
   {
       System.out.print("\n");
   
       System.out.println("Ward: "+wardname);
   
       System.out.println("*************************************");
   
       for(int i=0;i<nbp;i++)
       {
           arPatient[i].displayAll();
    
           System.out.println("*************************************");
   
       }
   }  
}
