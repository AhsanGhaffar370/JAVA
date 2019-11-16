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
public class Store 
{
    private String name;
    
     private String location;
     
     private Product []productlist=new Product[100];
     
     private int nbp;
     
     public Store(String name,String location)
     {
       this.name=name;
       this.location=location;
       nbp=0;
     }
     
     public String getname()
     {
        return name;
     }
     
     public void addproduct(Product p)
     {
      
        if(nbp<=100)
        {
            productlist[nbp]=p;
     
            nbp++;
        }
        
      else
        {
            System.out.println("Not enough space");
        }
        
     }
     
     public boolean searchproduct(String name)
     {
        boolean result = false; 
        for(int i=0;i<nbp;i++)
        {
            if(productlist[i].getName().equals(name))
            {
              result=true;
              break;
            }
       
        }
        return result;
     }
     
    public Product deleteProduct(String name)
    {
        Product temp = null;  
        int i;
         
    
        for(i=0;i<nbp;i++)
        {
        if(productlist[i].getName().equals(name))
        {
            temp=productlist[i];
          
            break;
        }
     }
        
      
        if(productlist[i].getName().equals(name))
      
        {
            for(int j=i;j<nbp;j++)
            {
                productlist[j]=productlist[j+1];
            }
        
            nbp--;
        }
      
      return temp;
     
    }
    
    public void displayall()
    {
        System.out.print("\n");
      
        System.out.println("Store: "+name);
      
        System.out.println("Location: "+location);
      
        System.out.println("*************************************");
      
        for(int i=0;i<nbp;i++)
        {
            System.out.println("Product: "+productlist[i].getName());
      
            System.out.println("*************************************");
        } 

    }

    
}
