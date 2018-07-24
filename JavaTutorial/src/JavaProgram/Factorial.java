package JavaProgram;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		int n, i,facto=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			facto=facto*i;
		
		}
		System.out.println(facto);
		

	}

}
