/*
 * Author: Jonathan Cote c0446292
 * Title: Lab6 Task1
 */
package Lab6;

public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] names = {
            { "Ewell", "Nate" },
            { "Smurthwaite", "Adelina" },
            { "Bernollet", "Maryjane" },
            { "Chalfain", "Karlis" },
            { "Huckabe", "Almire" }
        };
        double[][] grades = {
            { 3.83, 9.21, 9.25, 0.84, 1.40, 7.90, 1.41, 5.15 },
            { 5.09, 3.66, 3.04, 3.02, 8.59, 2.34, 8.86, 7.40 },
            { 5.35, 0.85, 8.56, 7.37, 2.78, 3.19, 2.04, 5.70 },
            { 9.25, 9.62, 7.08, 7.27, 9.86, 5.88, 9.86, 9.70 },
            { 3.39, 2.75, 1.23, 1.04, 3.87, 8.72, 4.60, 6.21 }
        };
        
        //find student GPA
        double[] gpa = studentGPA(grades);
        
        //Print out student GPA with names 
        System.out.println("Student Averages:");
        System.out.print(arrBinder(names, gpa));
        
        //find class avg from student GPA. Print avgGPA
        double avg = classAvg(gpa);
        System.out.println("\nclass avg: "+avg);
        
        //Find highest student GPA within class. Print name + GPA
        int highGrade = highestGrade(gpa);
        System.out.println("highest grade: "+names[highGrade][1] +" "
                +names[highGrade][0]+", "+gpa[highGrade]);
        
        //Find lowest student GPA within class. Print name + GPA
        int lowestGrade = lowestGrade(gpa);
        System.out.println("Lowest grade: "+names[lowestGrade][1] +" "
                +names[lowestGrade][0]+", "+gpa[lowestGrade]);
        
        
    }//end of main
    
    /**
     * @param grades
     * @return double[] arr
     * Purpose: figure out each students GPA from provided grades in
     * double[][] grades.
    */
    public static double[] studentGPA(double[][] grades){
        double[] arr = new double[grades.length];
        double gpa = 0;
        
        for(int i=0; i<grades.length; i++){
            for(int j=0; j<grades[i].length; j++){
                gpa = gpa + grades[i][j];
            }
            gpa = gpa/8;
            arr[i] = gpa;
            gpa = 0;
        }
        
        return arr;
    }// end of studentGPA
    
    /**
     * @param gpa
     * @return double avg
     * Purpose: take in each students GPA and then figure out average GPA
     * of the student group.
    */
    public static double classAvg(double[] gpa){
        double avg = 0;
        
        for(int i=0; i<gpa.length; i++){
            avg = avg + gpa[i];
        }
        avg = avg / gpa.length;
        
        return avg;
    }// end of classAvg
    
    /**
     * @param gpa
     * @return int index
     * Purpose: take every students GPA and figure out the highest grade
     * within the array of student GPA. Returning the index of highest grade.
    */
    public static int highestGrade(double[] gpa){
        int index = 0;
        double grade = gpa[index];
        for(int i=0; i<gpa.length; i++){
            if(grade<gpa[i]){
                grade = gpa[i];
                index = i;
            }
        }
        return index;
    }// end of highestGrade
    
    /**
     * @param gpa
     * @return int index
     * Purpose: take every students GPA and figure out the lowest grade
     * within the array of student GPA. Return the index of lowest grade.
    */
    public static int lowestGrade(double[] gpa){
        int index = 0;
        double grade = gpa[index];
        for(int i=0; i<gpa.length; i++){
            if(grade>gpa[i]){
                grade = gpa[i];
                index = i;
            }
        }
        return index;
    }// end of lowestGrade
    
    /**
     * @param names
     * @param avg
     * @return String str
     * Purpose: Binds the student names to their avg GPA. Return as a string
    */
    public static String arrBinder(String[][] names, double[] avg){
        String str = "";
        for(int i=0; i<avg.length; i++){
            for(int j=0; j<names[0].length; j++){
                str += (names[i][j]+' ');
            }
            str += (avg[i]+"\n");
        }
        return str;
    }// end of arrBinder
    
}//end of class
