/**
 * @author Jonathan Cote C0446292
 */
package Lab8;

/**
 *
 * @author c0446292
 */
public class Student {
   //Class variables
    private static int count = 0;
   //instance variables
    private int studentNum;
    private double gpa;
    private String name;
    private String lastName;
    private String major;
  
   //constructors 
    /**
    * @param -nothing
    */
    Student(){
        count++;
    }
    /**
    * @param String name
    * @param String lastName
    */
    Student(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
        count++;
    }
    
   //instance variables 
    
    /**
     * @param -nothing
     * Purpose: Set a new student number determined by static count
     */
    public void setStudentNum(){
        this.studentNum = Student.count;
    }
    
    /**
     * @param name
     * @param lastName
     * Purpose: Set a new First and Last name.
     */
    public void setName(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }
    
    /**
     * @param major
     * Purpose: Set a Major
     */
    public void setMajor(String major){
        this.major = major;
    }
    
    /**
     * @param major
     * Purpose: Set a new Major
     */
    public void changeMajor(String major){
        this.major = major;
    }
    
    /**
     * @param gpa
     * Purpose: Set a student GPA
     */
    public void setGPA(double gpa){
        this.gpa = gpa;
    }
    
    /**
     * @param -nothing
     * @return String
     * Purpose: get the student name
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * @param -nothing
     * @return String
     * Purpose: get the student last name
     */
    public String getLastName(){
        return this.lastName;
    }
    
    /**
     * @param -nothing
     * @return double
     * Purpose: get the student gpa
     */
    public double getGPA(){
        return this.gpa;
    }
    
    /**
     * @param -nothing
     * @return String
     * Purpose: get the student objects data and put into single string
     */
    public String toString(){
        String str = ("\nName: "+this.name+"\nLast Name: "+this.lastName
                        +"\nStudent Number: "+this.studentNum
                        +"\nMajor: "+this.major+"\nGPA: "+this.gpa+"\n");
        return str;
    }
}
