/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

import javax.swing.JFrame;


/**
 *
 * @author c0446292
 */
public class Viewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        //task 2 frame
//        SimpleGUI frame = new SimpleGUI();
//        frame.createGUI();
//        frame.setTitle("This Frame represents Various Layout Display");
//        frame.setSize(400,300);
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Calculator frame
        Calculator frame = new Calculator();
        frame.createGUI();
        frame.setSize(700,600);
        frame.setVisible(true);
     
        
    
    
    }
    
}
