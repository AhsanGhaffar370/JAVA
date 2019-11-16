/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan
 */
public class Project 
{
    private Manager manage;
    private boolean success=false;

    public Project(boolean success,Manager obj) {
        manage =obj;
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }
    
    
}
