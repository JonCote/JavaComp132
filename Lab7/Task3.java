/**
 * @author Jonathan Cote C0446292
 */
package Lab7;

/**
 *
 * @author c0446292
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //p
        Polygon p = new Polygon();
        p.setSideNum(6);
        p.setSideLength(20);
        p.setAngle(45);
        
        double d = p.findApothem();
        System.out.println("p apothem: "+d);
        p.setApothem(d);
        
        double a = p.findArea();
        System.out.println("p area: "+a);
        
        double pri = p.findPerimeter();
        System.out.println("p primeter: "+pri);
        
        
        
        //p2
        Polygon p2 = new Polygon();
        double area = p2.findArea();
        System.out.println("p2 area: "+area);
        
        p.printData();
        p2.printData();
        
        boolean b = p.equalTo(p2);
        System.out.println("p == p2? "+b);
        
        p2.setRegular(false);
        p2.findApothem();
        p2.findArea();
    }
    
}
