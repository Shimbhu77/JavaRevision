
public class Factorial {

	public static int factorial(int num) {
	
		if(num == 0 || num == 1)
		{
			return 1;
		}
		
		return num * factorial(num-1);
		
	}
	
	public static void main(String[] args) {
		
		int factValue = factorial(6);
		
		System.out.println(factValue);
		
	}
	
	
}
