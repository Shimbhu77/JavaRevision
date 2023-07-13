
public class Fibonacci {

	public static void main(String[] args) {
		
		int termNum = 5;
		
		int a = 0;
		int b = 1;
		
		System.out.print(a+b+" ");
		
		for(int i=0;i<termNum-1;i++)
		{
			int sum = a+b;
			
			System.out.print(sum+" ");
			
			a = b;
			b = sum;
			
		}
	}
}
