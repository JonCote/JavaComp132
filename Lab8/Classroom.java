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

/**
 *1 - use this example for the "think objects" lab
 */
public class Classroom {
    public static final int MAX = 30;
    /**
    Instance Variables
    */
    private Student[] students;
    private Faculty instructor;
    private int numberOfStudents;

    /** Initialize the object */
    public Classroom(){
        numberOfStudents = 0;
        students = new Student[MAX];
    }
    
    public Classroom (Faculty f){
        numberOfStudents = 0;
        students = new Student[MAX];
        instructor = f;
        
    }
    
    /**
     * Purpose: print out the current number of students in classroom.
     */
    public void getNumberOfStudents(){
         System.out.print(Integer.toString(numberOfStudents));
    }
    
    /**purpose: method getStudents will package the information from each students and returns it as a String
    * @param - nothing
    * @return - An String that holds each student information
    * Hint: use the toString method on each Student Object
    */
    public String getStudents(){
        String str = "";
        for(int i = 0; i<numberOfStudents; i++){
            str += ("\n" + i + ":" + students[i].toString());
        }
        return str;
    }
    /**purpose: to add students to the class, check to
    make sure that class is not full, and class size has not reached the MAX LIMIT
    * @param s
    * @return - nothing
    */
    public void addStudent (Student s){
        if(numberOfStudents<MAX){
            students[numberOfStudents] = s;
            numberOfStudents++;
        }

    }
    /**purpose: to Assign a Faculty member to the Classroom
    * @param - recieves a Faculty Object
    * @return - nothing
    */
    public void setFaculty(Faculty f){
        instructor = f;
    }
    /**purpose: to display information for the classroom. This includes all the students and the Faculty to the Class
    * @param - nothing
    * @return - an String containing classroom information
    * this class Overrides toString() method from Object class.
    */
    public String toString(){
        String str = ("\nInstructor: "+instructor.toString()+"\n"+getStudents());
        return str;
    }
}// end of Class Classroom
