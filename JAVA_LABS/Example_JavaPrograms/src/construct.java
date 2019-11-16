/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan
 */
public class construct
{

    //Parameterized constructors:
    int len,wid,res;
    construct(int x, int y)
    {
        System.out.println("Parameterized Constructor:");
        len=x;
        wid=y;
    }
    //Default constructor(Example 1) :
    //instance variables:
    int a,b;
    //OR Instance Method:
    construct()
    {
        System.out.println("Default Constructor");
        a=10;
        b=20;
    }
    
    void display()
    {
        System.out.println("The value of A is: "+a);
        System.out.println("The value of B is: "+b);
        
        res=len*wid;
        System.out.println("The result(len*wid) is: "+res);
    }

    void setName(String name1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
/*
   
    public Product deleteProduct(String p_name)
    {
        int temp=-1;
        
        
        for(int i=0;i<nb_product;i++)
        {
            if(p_list[i].getName()==p_name)
            {
                temp=i;
                break;
            }
            if(temp!=-1)
            {
                for(i=temp;temp<nb_product;i++)
                {
                    p_list[i]=p_list[i+1];
                    nb_product--;
                }
            }   
        }

        return p_name;
    }
*/