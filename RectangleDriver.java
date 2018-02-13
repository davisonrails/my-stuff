//this is the runner class of Rectangle.java, it was an assignment for my AP CS A class

import java.util.Scanner;
public class RectangleDriver {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter length: ");
        double localLength = scan.nextDouble();
        
        System.out.println("Enter width: ");
        double localWidth = scan.nextDouble();
        
        Rectangle r = new Rectangle(localLength, localWidth);
        
        System.out.println("\nUser Created Rectangle with Overloaded Constructor");
        System.out.println("The area is: " + r.getArea());
        System.out.println("The perimeter is: " + r.getPerimeter());
        
        Rectangle r2 = new Rectangle();
        r2.setLength(1);
        r2.setWidth(8);
       
        System.out.println("\nRectangle r2 = new Triangle() default constructor information");
        System.out.println("The area is: " + r2.getArea());
        System.out.println("The perimeter is: " + r2.getPerimeter());
        System.out.println(r2.toString());
        
        Rectangle r3 = new Rectangle(1.2, 3.6);
        System.out.println("\nUser Created Rectangle with Overloaded Constructor");
        System.out.println("The area is: " + r3.getArea());
        System.out.println("The perimeter is: " + r3.getPerimeter());
        System.out.println(r3.toString());
        
                               
    }
}
