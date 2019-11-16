/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Ahsan
 */
public class Store 
{
    private String name;
    private String location;
    public Product pro;
    private Product p_list[];
    private int nb_product;
    
    public Store(String name,String location)
    {
        name=name;
        location=location;
  
       p_list = new Product[100];
        nb_product=0;
    }
    
    public String getName()
    {
        return name;
    }
    //
    public void addProduct(Product p)
    {
        if (nb_product<100)
        {
            
            p_list[nb_product]=p;
            //System.out.println("Add product"+p);
            nb_product++;
        }
        
        else 
            System.out.println("Sorry, Products are full");
    }
    
    
    
    public boolean searchProduct(String p_name)
    {
        boolean b=true;
        for(int i=0;i<=nb_product;i++)
        {
            //
            if(p_list[i].getName()==p_name)
            {
                b=b; 
            }
            
            else 
                b=!b;
        }
        
        return b;
    }
    
    
    public Product deleteProduct(String p_name)
    {
        Product temp=null;
        
        
        for(int i=0;i<nb_product;i++)
        {
            if(p_list[i].getName()==p_name)
            {
                temp=p_list[i];
                break;
            }
            if(temp!=null)
            {
                for(i=0;i<nb_product;i++)
                {
                    p_list[i]=p_list[i+1];
                    nb_product--;
                }
            }   
        }

        return temp;
    }
    
    public void display()
    {
        for (int i=0;i<nb_product;i++)
        {
            System.out.println(p_list[nb_product]);
            i++;
        }
        
    }

   // private Product Product(String p_name, int i, int i0) {
   //     throw new UnsupportedOperationException("Not supported yet.");
   // }
}
