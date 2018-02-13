public class LineEditor {
  
   String myLine = "computer science";
   
   public void insert(String str, int index) {
     
     String topHalf = "";
     String bottomHalf = "";
     
     //this allows the string to be printed at any position
     if (index > 0 && index < myLine.length()) {
       
          topHalf = myLine.substring(0, index);
          bottomHalf = myLine.substring(index);
          
          
     }
          
       System.out.print(topHalf + "" + str + "" + bottomHalf);
       
     }
   
   public void delete(String str) {
     
    int index = myLine.indexOf(str);
    int length = str.length();
    
    //if the index isn't -1 (meaning the str is found within myLine), it will print what is on either side of the omitted sequence 
    if (index != -1) {
           String first = myLine.substring(0, index);
           String second = myLine.substring(index + length);
           myLine = first + second;
    }
    
    System.out.println(myLine);
  
    }
     
    public static void main (String []args) {
     
      LineEditor operate = new LineEditor();
      
      System.out.println("started with " + operate.myLine);
      
      operate.insert("AP ", 3);
      operate.delete("sci");
      
      }
     
   }
  
  
  
  
  
  
  
  
  
  
  
  
  
  

