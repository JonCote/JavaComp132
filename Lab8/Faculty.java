/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

/**
 *
 * @author c0446292
 */
public class Faculty {
    private String name = "";
    private String lastName = "";
    
    Faculty(){
    
    }
    
    Faculty(String n, String l){
        this.name = n;
        this.lastName = l;
    }
    
    public void setName(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }
    
    public String toString(){
        String str = (name + ", " + lastName);
        return str;
    }
}
