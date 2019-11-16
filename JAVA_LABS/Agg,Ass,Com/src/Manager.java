
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan
 */
public class Manager 
{
    public Project objP;
    
    private String manName=null;
    private double salary;

   // public List<Worker> worrkers=new List<Worker>();
    public Manager(String manName,double salary) 
    {
        this.manName = manName;
        this.salary=salary;
    }

    public String getManName()
    {
        return manName;
    }

    public double getSalary() {
        return salary;
    }
    
    public void logon(Swipecard obj)
    {
        obj.Swipe(this);
    }
 
    public double man_progress()
    {
        if(objP.isSuccess()==true)
        {
            System.out.println("After progress in project: "+(salary+=100));
        }
        return salary;
    }
    
    public String toString()
    {
        return ("Salary: "+salary+man_progress());
    }
}
