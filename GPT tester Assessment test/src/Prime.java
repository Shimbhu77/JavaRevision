
import java.util.*;

public class Prime {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		boolean value = isPrime(num);
		
		System.out.println(value);
	}

	public static boolean isPrime(int num) {
		
		int sqrtNum = (int) Math.ceil(Math.sqrt(num));
		
		for(int i=2 ;i<=sqrtNum;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		
		return true;
	}
}
