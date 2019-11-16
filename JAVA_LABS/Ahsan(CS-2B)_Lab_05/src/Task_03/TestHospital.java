/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_03;

/**
 *
 * @author Ahsan
 */
public class TestHospital 
{
    public static void main(String [] args)
    { 
        Patient p1 = new Patient(); 
        
        p1.read(); Patient p2 = new Patient(); 
        
        p2.read(); Patient p3 = new Patient(); 
        
        p3.read(); 
        
        Ward w1 = new Ward("Childern"); 
        
        w1.addPatient(p1); 
        
        w1.addPatient(p2); 
        
        w1.displayAll();
        
        w1.searchPatient(2);
        
        w1.deletePatient(2); 
        
        w1.displayAll();
        
        Ward w2 = new Ward("General");
        
        w2.addPatient(p2); w2.addPatient(p3); 
        
        w2.displayAll(); 
        
        Hospital h1 = new Hospital("Jinnah"); 
        
        h1.addWard(w1); 
        
        h1.addWard(w2);
        
        h1.displayAll();
        
        h1.searchWard("General");
        
        h1.deleteWard("Childern");
        
        h1.displayAll();
    } 
}

