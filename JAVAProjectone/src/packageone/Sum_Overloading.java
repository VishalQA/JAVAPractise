package packageone;

public class Sum_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        
        System.out.println(sum(4,5));
        System.out.println(sum(4,5,6));
        //System.out.println(sum(4,5,6,7));
        System.out.println(sum(10.10, 20.20));
	}
       public static int sum(int i , int j ) {
    	  int  sum = i+j;
    	  return sum;
    	 
       }
       
       public static int sum(int k , int l , int m ) {
    	   int sum = k+l+m;
    	   return sum;
    	  
       }
	
       public static double sum(double p , double q) {
    	   double sum = p+q;
    	   return sum;
       }
	
}
