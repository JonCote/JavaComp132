/**
 * @author Jonathan Cote C0446292
 */
package Lab7;

/**
 *
 * @author c0446292
 */
public class Course {
 //instance variables
  private int courseNum = 0;
  private int roomNum = 0;
  private String description = "Its a Class";
  private String instructor = "Ms.Teacher";
 //Class variables 
  private static int numberOfCourse =0;
    
  //constructors
   /**
    * @param -nothing
    */
    Course(){
        
    }
    
    /**
    * @param int courseNum
    */
    Course(int courseNum){
        this.courseNum = courseNum;
    }
    
    /**
    * @param int courseNum
    * @param String instructor
    */
    Course(int courseNum, String instructor){
        this.courseNum = courseNum;
        this.instructor = instructor;
    }
    
    /**
    * @param int courseNum
    * @param int roomNum
    */
    Course(int courseNum, int roomNum){
        this.courseNum = courseNum;
        this.roomNum = roomNum;
    }
    
    /**
    * @param int courseNum
    * @param int roomNum
    * @param String instructor
    * @param String description
    */
    Course(int courseNum, int roomNum, String instructor, String description){
        this.courseNum = courseNum;
        this.roomNum = roomNum;
        this.instructor = instructor;
        this.description = description;
    }
   //Class methods
    /**
     * @param -nothing
     * Purpose: Static method to increase course count
     */
    static void addCourse(){
        numberOfCourse++;
    }
    
     /**
     * @param c
     * Purpose: Static method to decrease course count and remove object data
     */
    static void removeCourse(Course c){
        c.courseNum = 0;
        c.roomNum = 0;
        c.instructor = null;
        c.description = null;
        numberOfCourse--;
    }
    
     /**
     * @param -nothing
     * Purpose: Static method to print course count
     */
    static void printCourseCount(){
        System.out.print(numberOfCourse+"\n");
    }
    
   //instance methods 
    
    /**
     * @param courseNum
     * Purpose: Set a new course number
     */
    public void newCourseNum(int courseNum){
        this.courseNum = courseNum;
    }
    
    /**
     * @param description
     * Purpose: Set a new course Description
     */
    public void newCourseDescrip(String description){
        this.description = description;
    }
    
    /**
     * @param instructor
     * Purpose: Set a new course Instructor
     */
    public void newInstructor(String instructor){
        this.instructor = instructor;
    }
    /**
     * @param roomNum
     * Purpose: Set a new course room number
     */
    public void newRoomNum(int roomNum){
        this.roomNum = roomNum;
    }
    
    /**
     * @param c
     * @return boolean
     * Purpose: Equate if two course objects have equal course numbers
     *          and room number.
     */
    public boolean equalTo(Course c){
        boolean b = ((this.courseNum == c.courseNum)
                       && (this.roomNum == c.roomNum)
                       && (this.instructor.equalsIgnoreCase(c.instructor))
                       && (this.description.equalsIgnoreCase(c.description)));
        
        return b;
    }
    
    /** 
     * @param -nothing
     * Purpose: print out object data.
     */
    public void displayData(){
        System.out.print("\nCourse Number: " + this.courseNum
                            + "\nRoom Number: " + this.roomNum
                            + "\nInstructor: " + this.instructor
                            + "\nDescription: " + this.description + "\n");
    }
    /**
     * @param -nothing
     * @return String
     * Purpose: collect all Course object data into a single string for return
     */
    public String getData(){
        String str = ("Course Number: " + this.courseNum
                        + "\nRoom Number: " + this.roomNum
                        + "\nInstructor: " + this.instructor
                        + "\nDescription: " + this.description);
        return str;
    }
}
