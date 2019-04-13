/**
 * @author Jonathan Cote C0446292
 */
package Lab7;
import java.util.Scanner;
/**
 *
 * @author c0446292
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Student s1 = new Student();
        s1.setStudentNum();
        
        System.out.print("Input Name: ");
        String name = input.next();
        System.out.print("Input lastName: ");
        String lastName = input.next();
        s1.setName(name, lastName);
        
        System.out.print("Input Major: ");
        String major = input.next();
        s1.setMajor(major);
        
        s1.setGPA(7.54);
        
        String str = s1.getData();
        System.out.print(str);
        
        
        Student s2 = new Student(name, lastName);
        s2.setStudentNum();
        
        str = s2.getName();
        System.out.println(str);
        str += s2.getLastName();
        System.out.println(str);
        double d = s2.getGPA();
        System.out.print(str+" "+d);
        
        
        
        
        
    }
    
}
