/**
 * @author Jonathan Cote C0446292  
 */
 
package Lab7;

public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Course c1 = new Course();
        Course c2 = new Course(208);
        Course c3 = new Course(208, "Mr.Teacher");
        Course c4 = new Course(208, 112);
        Course c5 = new Course(208, 112, "Mr.Teacher", "The best class");
        
        
        c1.displayData();
        c2.displayData();
        
        boolean b = c1.equalTo(c2);
        System.out.print(b+"\n");
                
        c1.newCourseNum(208);
        c1.displayData();
        
        b = c1.equalTo(c2);
        System.out.print(b+"\n");
        
        c3.newCourseDescrip("The worlds first class");
        c3.newInstructor("Bob");
        c3.newRoomNum(314);
        // Grabing Data within the object as a string and printing
        String str = c3.getData();
        System.out.print("\n"+str+"\n");
        
        Course.addCourse();
        Course.printCourseCount();
        Course.removeCourse(c4);
        Course.printCourseCount();
        c4.displayData();
        
        
        
        //
        
    }// end of main
    
}// end of class
