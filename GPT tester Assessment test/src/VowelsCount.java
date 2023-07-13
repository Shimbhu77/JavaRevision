import java.util.Arrays;

public class VowelsCount {

	public static void main(String[] args) {
		
		String value = "I Love Machine Learning";
		
		String lowercaseValue = value.toLowerCase();
		
		char[] chars = lowercaseValue.toCharArray();
		
//		System.out.println(Arrays.toString(chars));
		
		int count =0;
		for(int i=0;i<chars.length;i++)
		{
			if(chars[i]=='a' || chars[i]=='e' || chars[i]=='i' || chars[i]=='o' || chars[i]=='u')
			{
				count++;
			}
		}
		
		System.out.println("total vowels : "+count);
		
	}
}
