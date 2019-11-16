
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan
 */
public class TestProject 
{
     public static void main(String args[]) {
    ArrayList<Car> carlist = new ArrayList<Car>();
    carlist.add(new Car("Toyota", "Altis", "GJKFG457", 100, 60));
    carlist.add(new Car("Toyota", "Vios", "KDFJGK435", 100, 50));
    carlist.add(new Car("Nissan", "Latio", "DFGFD45", 100, 50));
    carlist.add(new Car("Murano", "Nissan", "DGFDG345", 300, 150));

    carlist.add(new Car("Honda", "Jazz", "GK4535443", 100, 60)); 
    carlist.add(new Car("Honda", "Civic", "GKDHFG45", 120, 70)); 
    carlist.add(new Car("Honda", "Stream", "JHD478BG", 120, 70)); 
    carlist.add(new Car("Honda", "Odyssey", "BHFHS47", 200, 150)); 
    carlist.add(new Car("Subaru", "WRX", "KJGHDFG78", 300, 200));
    carlist.add(new Car("Subaru", "Imprezza", "SJE8234K", 150, 80));
    Scanner input = new Scanner(System.in);
    System.out.print("Enter model to rent: ");
    String model = input.nextLine();
    for(Car s : carlist){
        if (model.equals(s.getModel())) {
            System.out.println("Model " + model + " is available");
            System.out.print("Enter number of days: ");
            int days = input.nextInt();
            System.out.println("****Details****");
            int cost = (days * s.getRate()) + s.getDeposit();
            System.out.println("Deposit DailyRate Duration TotalCost"); 
            System.out.println(s.getDeposit() + " " + s.getRate()+ " " + days + " " + cost);
            System.out.print("Proceed to rent?( y/n ): ");
            String dec = input.next();
            if (dec.equals("y")) {
                System.out.println("Enter Customer Name: "); 
                String name = input.next(); 
                System.out.println("Enter IC Number: ");
                int num = input.nextInt();
                System.out.println("***Receipt****");
                System.out.println("Name ICNo Car RegNo Duration TCost");
                System.out.println(name + " " + num + " " + model + " " + s.getRegNo() + " " + days + " "+cost);
                System.out.println("Serving Next Customer ");
                } 
                else if (dec.equals("n")) {
                    System.out.println("Serving Next Customer: ");
                    
                } 
                    
        }
                    
    }
                    
    } 
}
