/**
 * @author Jonathan Cote C0446292
 */
package Lab7;

import static java.lang.Math.sqrt;
import static java.lang.Math.tan;

/**
 *
 * @author c0446292
 */
public class Polygon {
   //instance variables
    private boolean regular;
    private int sides;
    private double sideLength;
    private double angle;
    private double apothem;
    
  //Constructors
    /**
     * @param -nothing
     */
    Polygon(){
        regular = true;
        sides = 3;
        sideLength = 1;
        angle = 60;
        apothem = sqrt(3)/2;
    }
    
   //instance methods
    
    /**
     * @param sides
     * Purpose: Set the number of sides for polygon
     */
    public void setSideNum(int sides){
        this.sides = sides;
    }
    /**
     * @param sideLength
     * Purpose: Set the length of the polygons sides
     */
    public void setSideLength(double sideLength){
        this.sideLength = sideLength;
    }
    
    /**
     * @param angle
     * Purpose: Set the polygons angle degree
     */
    public void setAngle(double angle){
        this.angle = angle;
    }
    
    /**
     * @param apothem
     * Purpose: Set the apothem length
     */
    public void setApothem(double apothem){
        this.apothem = apothem;
    }
    public void setRegular(boolean b){
        this.regular = b;
    }
    
    /**
     * @param -nothing
     * @return double
     * Purpose: find the apothem length of a regular poygon
     */
    public double findApothem(){
        // a = s/(2tan(pie/n))
        double a = 0;
        if(this.regular == true){
            a = this.sideLength / (2.0 * (tan(3.14/this.sides)));
            return a;
        }else
            System.out.println("Error polygon is irregular");
        return a;
    }
    
    /**
     * @param -nothing
     * @return double
     * Purpose: find the area of a regular polygon
     */
    public double findArea(){
        //A = 1/2(ap)
        double area = 0;
        if(this.regular == true){
            area = ((0.5)*(this.apothem * (this.sideLength * this.sides)));
            return area;
        }else
            System.out.println("Error polygon is irregular");
        return area;
    }
    
    /**
     * @param -nothing
     * @return double
     * Purpose: find the perimeter
     */
    public double findPerimeter(){
        double pri = this.sideLength * this.sides;
        return pri;
    }
    /**
     * @param p
     * @return boolean
     * Purpose: equate if two polygons are equal
     */
    public boolean equalTo(Polygon p){
        boolean b = ((this.regular == p.regular) && (this.sides == p.sides)
                        && (this.sideLength == p.sideLength)
                        && (this.angle == p.angle)
                        && (this.apothem == p.apothem));
        return b;
    }
    /**
     * @param -nothing
     * Purpose: Print the stored data
     */
    public void printData(){
        System.out.print("\nRegular: "+this.regular+"\nSides: "+this.sides
                            +"\nSide Length: "+this.sideLength
                            +"\nAngle: "+this.angle
                            +"\nApothem: "+this.apothem+"\n");
    }
}
