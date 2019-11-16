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
public class store 
{
    private String name,loc;
    private product productlist[]=new product[100];
    private int nbp=0;

    public store(String name, String loc) {
        this.name = name;
        this.loc = loc;
    }

    public String getName() {
        return name;
    }
    
    public void addproduct(product p)
    {
        if(nbp <= 100)
        {
            productlist[nbp]=p;
            nbp++;
        }
        else{
            System.out.println("not enough space");
        }
    }
    
    public boolean searchP(String pname)
    {
        boolean flag=false;
        
        for(int i=0; i<nbp; i++)
        {         
            if(productlist[i].getName().equals(pname))
            {
                flag=!flag;
            }
        } 
        return flag;
    }
    
    public product deleteprod(String pname)
    {
        int i=0;
        boolean flag=false;
        product temp=null;
        for(; i<nbp; i++)
        {
            if(productlist[i].getName().equals(pname))
            {
                temp=productlist[i];
                nbp--;
                flag=true;
                break;
            }
        }
        
        if(flag==true)
        {
            for(int j=i; j<nbp; j++)
                productlist[j]=productlist[j+1];
            
            return temp;
        }
        else
            return null;
        
    }
    
    public void displayall()
    {
        System.out.print("\n");
      
        System.out.println("Store: "+name);
      
        System.out.println("Location: "+loc);
      
        System.out.println("*************************************");
      
        for(int i=0;i<nbp;i++)
        {
            System.out.println("Prod_Name: "+productlist[i].getName()+"  Quantity: "+productlist[i].getQty()+"  Price: "+productlist[i].getPrice());
      
            System.out.println("*************************************");
        } 
    }
}
