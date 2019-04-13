/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author shohreh
 */
public class Calculator extends JFrame implements ActionListener {


   private JPanel panel, panel2;
   private JButton starMatrix, numMatrix,b3;
   private JTextField num1, num2,result;
   private JTextArea textArea;
   private JScrollPane scroll;
   private JLabel equalLabel;
   private JButton plus;
   private JButton minus;
   private Matrix matrix;

   Calculator(){
       matrix = new Matrix();
   }
   
    public void createGUI(){
       // tells the program to terminate when the frame is closed.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container box = this.getContentPane();
       // box.setLayout(new FlowLayout(FlowLayout.CENTER,10,20) );
        GridLayout grid = new GridLayout(2,2,10,20);
        box.setLayout(grid);


        panel = new JPanel();
        panel.setBackground(new Color(10,220,40));
        panel.setPreferredSize(new Dimension (400,200));
        box.add(panel);
        
        panel2 = new JPanel();
        panel2.setBackground(new Color(0,20,220));
        panel2.setPreferredSize(new Dimension (400,200));
        box.add(panel2);

        // organizing the panel
        num1 = new JTextField(15);
        panel.add(num1);

        plus = new JButton(" + ");
        panel.add(plus);
        plus.addActionListener(this);

        minus = new JButton(" - ");
        panel.add(minus);
        minus.addActionListener(this);

        num2 = new JTextField(7);
        panel.add(num2);
        
        equalLabel = new JLabel(" = ");
        panel.add(equalLabel);

        result = new JTextField(7);
        panel.add(result);
        
       // organizing panel2
        
        textArea = new JTextArea(10, 30);
        textArea.setBackground(Color.YELLOW);
        panel2.add(textArea);
        
        scroll = new JScrollPane(textArea);
        panel2.add(scroll);
        
        starMatrix = new JButton("Generate Matrix");
        panel2.add(starMatrix);
        starMatrix.addActionListener(this);
        
        numMatrix = new JButton("Number Matrix");
        panel2.add(numMatrix);
        numMatrix.addActionListener(this);
        
        


    }// end of create GUI
    
    
    public double getNumTextData(JTextField num){
        String strNum = num.getText();
        double doubleNum = Double.parseDouble(strNum);
        return doubleNum;
    }
    
    
   @Override
    public void actionPerformed (ActionEvent event){
       
        
        if (event.getSource()== plus){
            double double1 = getNumTextData(this.num1);
            double double2 = getNumTextData(this.num2);
            this.result.setText(Double.toString(double1 + double2));
        }if(event.getSource()== minus){
            double double1 = getNumTextData(this.num1);
            double double2 = getNumTextData(this.num2);
            this.result.setText(Double.toString(double1 - double2));
        }
        
        if(event.getSource() == starMatrix){
            textArea.append(matrix.drawMatrix());
        }
        if(event.getSource() == numMatrix){
            textArea.append(matrix.drawMatrixNum(matrix.fillMatrix()));
        }


    }// end of action performed

}// end of class
