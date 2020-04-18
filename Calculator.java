public abstract class Calculator<E> implements Multiplier, Divider{
   protected int total; 
   
   public Calculator() {
   total = 1;
	}
   public void multiply(int y){
   int m = y*total;
   total = m;
   }
   public void divide(int y){
   int d = total/y;
   total = d;
   }
   public abstract int calculate();
}