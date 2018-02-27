public class Quadratic {

    private int a;
    private int b;
    private int c;
    private double discrim;
    
    public Quadratic() {  }
    
    public Quadratic(int aVal,  int bVal, int cVal) {
        a = aVal;
        b = bVal;
        c = cVal;
    }

    public boolean hasSolutions() {
        discrim = Math.pow(b, 2) - (4 * a * c);
        if (discrim >= 0){
            return true;
        } else {
            return false;
        }
    }
    
    public double getSolution1(){
        return (-b + Math.sqrt(Math.pow(b ,2) - (4 * a * c))) / (2 * a); 
    }
    
     public double getSolution2(){
        return (-b - Math.sqrt(Math.pow(b ,2) - (4 * a * c))) / (2 * a); 
     }
    
     public String toString() {
         return "The Quadratic Equation is: " + "(negative " + b + " minus " + "(the sqrt of " + b + " squared " + "minus " + "4 " + "times " + a + " times " + c + ")) , divided by two times " + "a";
     }
        

}
