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
public class Hospital 
{
        
    private String hosname;
    private Ward []arWard=new Ward[10];
    private int nbw;
    
    public Hospital(String name)
    {
        hosname=name;
        nbw=0;
    }
    
    public void addWard(Ward w)
    {
        if(nbw<=10)
        {
            arWard[nbw]=w;
        }
    
        else
        {
            System.out.println("Not enough space");
        }
    }
    
    public void searchWard(String name)
    {
        int i;
        for(i=0;i<nbw;i++)
        {
            if(arWard[i].getwardname().equals(name))
            {
                System.out.println("Ward Founded");
       
                System.out.println("*************************************");
       
                arWard[i].displayAll(); 
       
                System.out.println("*************************************");
      
                break;
            }
            
            if(!arWard[i].getwardname().equals(name))
            
            {
                System.out.println("Ward Not Founded");
            }
        }
    }
    
    public void deleteWard(String name)
    {
        int i;
        for(i=0;i<nbw;i++)
        {
            if(arWard[i].getwardname().equals(name))
            { 
                break;
            }
        }
    
        if(arWard[i].getwardname().equals(name))
        {
            for(int j=i;j<nbw;j++)
            {
                arWard[j]=arWard[j+1];
            }
    
            System.out.println("Ward: "+name+" Deleted");
    
            nbw--;
        }
   
        else
        {
            System.out.println("Ward: "+name+" not Founded");
        }
    }
    
    public void displayAll()
    {
        System.out.print("\n");
    
        System.out.println("Hospital: "+hosname);
   
        for(int i=0;i<nbw;i++)
        {
            arWard[i].displayAll();
        }
    }
}
