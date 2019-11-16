package Task_02;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Company 
{
    private String name;
    Store []storelist=new Store[10];
    private int nbstore;
    
    public Company(String name)
    {
        this.name=name;
        nbstore=0;
    }
    
    public void addstore(Store s)
    {
        if(nbstore<=10)
        {
            storelist[nbstore]=s;
            nbstore++;
        }
    }
    
     public int searchnbstore(String name)
     {
        boolean temp=false;
     
        for(int i=0;i<nbstore;i++)
        {
            temp=storelist[i].searchproduct(name);     
        }
        
        if(temp==true)
        {
           return nbstore;
        }
     return 0;
     }
     
     public void displayall()
     {
        System.out.print("\n");
     
        System.out.println("Company "+name);
     
        System.out.println("*************************************");
     
        for(int i=0;i<nbstore;i++)
        {
            System.out.println("Store: "+storelist[i].getname());
            System.out.println("*************************************");
        }
   }

}
