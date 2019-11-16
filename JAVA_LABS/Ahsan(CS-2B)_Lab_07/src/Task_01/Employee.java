/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_01;

/**
 *
 * @author Ahsan
 */
public class Employee 
{
    private String fname,lname,cnic;

    public Employee(){
    }
    
    public Employee(String fname, String lname, String cnic)
    {
        this.fname = fname;
        this.lname = lname;
        this.cnic = cnic;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }
    
    public double earnings( ) 
    {
        return 8.00;
    }
    
    public String toString( ) 
    {
        return ("First Name: "+getFname()+"\nLast Name: "+getLname()+"\nCNIC: "+getCnic());
    }
}
