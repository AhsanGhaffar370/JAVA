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
import java.util.Vector;
public class Flight 
{ 
    private String id;
    private String destination;
    private Time dept;
    private Time arival;
    private Vector passengerlist;

    public Flight(String id,String destination,Time dept,Time arrival)
    {
        this.id=id;
        this.dept=dept;
        this.arival=arrival;
        this.destination=destination;
        passengerlist=new Vector();
    }
    
    public void addpassenger(Passenger p)
    {
        passengerlist.addElement(p);
    }
    
    public void printinfo()
    {
        System.out.println("Flight Num:"+id);
        System.out.println("Destiantion:"+destination);
        System.out.println("Departure:"+dept);
        System.out.println("Arrival:"+arival);
        System.out.println("Number of Passengers:"+passengerlist.size());
        System.out.println("List Of Passenger");
        for(int i=0;i<passengerlist.size();i++)
        {
            Passenger p=(Passenger)passengerlist.elementAt(i);
            
            System.out.println(p);
        }
    }
}
