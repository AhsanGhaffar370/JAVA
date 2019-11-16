/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_002;

/**
 *
 * @author Ahsan
 */
public class comp 
{
    private String name;
    private store storearrlist[]=new store[10];
    private int nbstore;

    public comp(String name) {
        this.name = name;
    }
    
    public void addstore(store st)
    {
        if(nbstore <= 10)
        {
            storearrlist[nbstore]=st;
            nbstore++;
        }
        else{
            System.out.println("Not enough space for stores");
        }
    }
    
    public int ser_nbstore(String prodName)
    {
        int nbsp=0;
        for(int i=0;i<nbstore;i++)
        {
            if(storearrlist[i].searchP(prodName)==true)
                nbsp++;  
        }
        return nbsp;
    }
    
    public void dispall()
    {
        boolean flag=false;
        System.out.println("\n--------------\nCompany "+ name+"\n--------------\n");
        
        for(int i=0 ; i<nbstore ; i++)
        {
            if(storearrlist[i]!=null){
                 System.out.println("Stores"+(i+1)+"  "+storearrlist[i].getName());
                 flag=true;
            }
        }
        if(flag==false){
        
            System.out.println("Theres no store found:");
        }
    }
}
