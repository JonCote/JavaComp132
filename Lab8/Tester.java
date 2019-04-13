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
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student s1 = new Student("jon", "cote");
       Student s2 = new Student("smith", "W");
       Classroom c = new Classroom();
       Faculty f = new Faculty("The", "Man");
       c.addStudent(s1);
       c.addStudent(s2);
       String str = c.getStudents();
       System.out.print(str);
       c.setFaculty(f);
       System.out.print(c.toString());
       c.getNumberOfStudents();
    }
    
}