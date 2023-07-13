
public class Palimdrome {

	public static boolean isPalimdrome(String str) {
		
		StringBuilder restr = new StringBuilder(str);
		
		String reverse = restr.reverse().toString();
		
		if(reverse.equals(str))
		{
			return true;
		}
		
	    return false;
	}
		public static void main(String[] args) {
		
		String str = "racecar";
		
		boolean value = isPalimdrome(str);
		
		System.out.println(value);
		
	}
}
