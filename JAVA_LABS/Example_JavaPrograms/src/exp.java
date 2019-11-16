/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan Ghaffar
 */
public class exp 
{
    public static void main(String[] args) {
        short a1 =6;
        new exp().go(a1);
        new exp().go(new Double(7));
        
    }
    public void go(short x)
    {
        System.out.println("S");
    }
    
        public void go(Long x)
    {
        System.out.println("L");
    }
            public void go(int x)
    {
        System.out.println("i");
    }
                public void go(Number x)
    {
        System.out.println("N");
    }

}
