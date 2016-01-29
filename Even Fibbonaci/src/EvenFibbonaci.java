
public class EvenFibbonaci {
	private static int fibbonaciSum(int limit){
	    int prev = 0;
	    int current = 1;
	    int temp = 0;
	    int sum=0;
	    
	    while(current+prev <= limit){
	    	temp = prev+current;
	    	prev = current;
	    	current = temp;
	    	if(current%2==0){
	    		sum+=current;
	    	}
	    }
	    return sum;
	}
	public static void main(String[] args) {
	    System.out.println(fibbonaciSum(4000000));
	}
}
