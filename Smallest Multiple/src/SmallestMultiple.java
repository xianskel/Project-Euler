
public class SmallestMultiple {

private static int isDivisible(int num){
		
		int result = num;
		int i = 0;
		
		while(i!=1){
			for(i=num-1; i>1; i--){
				if(result%i!=0){
					result+=num;
					break;
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
	    System.out.println(isDivisible(20));
	}
}
