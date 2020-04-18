public class UnitTests{
     public static void main(String args[]){
      multiplyTest();
      divideTest();
      calculateTest();
      
     }
     public static void multiplyTest(){
     MiniCalculator mullet = new MiniCalculator();
     mullet.multiply(5);
     if (mullet.calculate() != 5) {
         System.out.println("FAILED MULTIPLY");
     }
     else{
          System.out.println("SUCCESS MULTIPLY");
     }         
  }
     public static void divideTest(){
     MiniCalculator div = new MiniCalculator();
     div.multiply(10);
     div.divide(5);
     if (div.calculate() != 2) {
         System.out.println("FAILED DIVIDE");
     }
     else{
          System.out.println("SUCCESS DIVIDE");
     }
  }
   public static void calculateTest(){
   MiniCalculator testi = new MiniCalculator(); 
   if (testi.calculate() != 1) {
         System.out.println("FAILED CALCULATE");
     }
     else{
          System.out.println("SUCCESS CALCULATE");
     }
  }
  
}