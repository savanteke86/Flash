package JavaProgram;

public class Reversestring 
{
	public static void main(String[] args) 
	{
		String s="savan";
		String p="";

		for(int i=s.length()-1;i>=0;i--)
		{
			
		
			System.out.println(p=p+s.charAt(i));
		}
		
		System.out.println(p);

		
	}

}
