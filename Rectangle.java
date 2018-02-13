//this is the part where I had to use the instance variables, constructors, accessor and mutator methods, the whole 9 yards

public class Rectangle {
    
    private double length;
    private double width;
    private double perimeter;
    private double area;
    
    public Rectangle(){ }
    
    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    
    public double getLength(){
        return length;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setLength(double s){
        length = s;
    }
    
    public void setWidth(double s){
        width = s;
    }
    
    public double getArea(){
        area = length * width;
        return area;
    }
    
    public double getPerimeter(){
        perimeter = (length + width) * 2;
        return perimeter;
    }

    public String toString(){
        return "Rectangle: Length = " + length + " Width = " + width + " Perimeter = " + perimeter + " Area = " + area;
    }
    
}
