
public class PrimeFactors {
	private static int largest(long number) {
	    int i;
	    for (i=2; i==2; i++) {
	    	if (number % i == 0) {
	            number /= i;
	            i--;
	            }   
	    } 
	    for (i=3; i<=number; i+=2) {
	    	if (number % i == 0) {
	            number /= i;
	            i-=2;
	            }   
	    }
	    return i;
	}


	public static void main(String[] args) {
	    System.out.println(largest(600851475143L));
	}
}
