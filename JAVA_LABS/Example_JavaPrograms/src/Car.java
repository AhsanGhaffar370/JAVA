/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan
 */
import java.util.*;
public class Car 
{
 private String make; private String model; private String regNo; private int deposit; private int rate;

    public Car(String newMake, String newModel, String newRegNo,
                    int newDeposit, int newRate) {
            make = newMake;
            model = newModel;
            regNo = newRegNo;
            deposit = newDeposit;
            rate = newRate;
    }

    public String getMake() {
            return make;
    }

    public String getModel() {
            return model;
    }

    public String getRegNo() {
            return regNo;
    }

    public int getDeposit() {
            return deposit;
    }

    public int getRate() {
            return rate;
    }

}



