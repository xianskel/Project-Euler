
public class PalindromeProduct {
	private static int largest(int min, int max){
		int result=0;
		
		for(int i=min; i<=max; i++){
			for(int j=i; j<=max; j++){
				if(isPalindrome(Integer.toString(i*j))){
					result = Math.max(result, j*i);
				}
			}
		}
		return result;
	}
	
	private static boolean isPalindrome(String num){
		for(int i=0; i<num.length()/2; i++){
			if(num.charAt(i)!=num.charAt(num.length()-1-i)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
	    System.out.println(largest(100, 999));
	}
}
