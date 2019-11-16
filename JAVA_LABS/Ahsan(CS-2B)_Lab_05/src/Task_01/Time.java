package Task_01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan
 */
public class Time 
{   
    private int hour;
    private int minute;
    
    public Time(int h,int m)
    {
        this.hour=h;
        this.minute=m;
    }
    
    public int getHour()
    {
        return hour;
    }
    
    public int getMinute()
    {
        return minute;
    }
    
    public String toString()
    {
        return hour+":"+minute;
    }
}
