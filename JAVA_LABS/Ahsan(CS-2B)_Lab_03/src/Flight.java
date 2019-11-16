/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fall2015
 */
import java.util.Scanner;
public class Flight 
{
    //creat a constant variable:
    public final double Total_s=340;
    
    Scanner cin=new Scanner(System.in);
    
    //declaring int and string variables:
    int flight_n,available_seat;
    
    String source,destination;
    
    //create a parameterized constructor which take flight number ,destination and availables seats:
    public Flight(int fn,String s,String d,int a_s)
    {
        flight_n=fn;
        
        this.source = shortAndCapital(s);
        
        this.destination = shortAndCapital(d);
        
        available_seat=a_s;
    }
    
    //create an overloaded constructor which take flight num and avaialble seat:
    public Flight(int fn,int a_s)
    {
        flight_n=fn;
        
        source="";
        
        destination="";
        
        available_seat=a_s;
    }
    
    //create an overloaded constructor which takes only flight num:
    public Flight(int fn)
    {
        flight_n=fn;
        
        source="";
        
        destination="";
        
        available_seat=0;
    }

    
    //create getters of flight num,source ,destination and available seats:
    
    public int getFlight_n() 
    {
        return flight_n;
    }

    public String getSource() 
    {
        return source;
    }

    public void setSource(String source) 
    {
        this.source = source;
    }

    public String getDestination()
    {
        return destination;
    }

    //create getters of source ,destination and available seats:
    public void setDestination(String destination) 
    {
        this.destination = destination;
    }

    public int getAvailable_seat() 
    {
        return available_seat;
    }

    public void setAvailable_seat(int available_seat)
    {
        this.available_seat = available_seat;
    }

    
    //create a method which reserve seats for client:
    public void reserve(int r)
    {
        //apply if and else condition to reserve seats:
        if(available_seat>=r)
        {
            System.out.println("\nSeats are Reserved:");
            available_seat-=r;
        }
        
        else
            System.out.println("\nSoory, The seats are not available:");
    }
   
    //create a method to cancel seat :
    public void cancel(int c)
    {
        //use if and else condition to cancel seats :
        if(Total_s>available_seat && (Total_s-available_seat)>=c)
        {
            System.out.println("\nSeats Cancelled:");
        }
    }

    //creat method which convert short case letters into uppercase:
    private String shortAndCapital(String name)
    {
        if (name.length() <= 3) 
        {
            return name.toUpperCase();
        } 
        
        else 
        {
            return name.substring(0, 3).toUpperCase();
        }
    }

    //create a methof to compare two flights:
    public void equals(Flight f) 
    {
        if (this.flight_n == f.getFlight_n()) 
        {
            System.out.println("\nTwo Flights are same");
        } 
        
        else 
        {
            System.out.println("\nTwo Flights are not same");
        }
    }

    //use tostring method to return fn ,s,d:
    public String toString() 
    {
        return ("\nFlight num: "+flight_n +"\n\n From: "+ source+"\n\n To: "+destination);

    }

}
