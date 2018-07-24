package JavaProgram;

public class Variabeles
{
	int a=10;
	int b=20;
	static int c=30;
	static int d=40;
	void m1()
	{
		int e=50,f=60;
		System.out.println(e+f);
	}
	static void m2()
	{
		Variabeles x=new Variabeles();
		System.out.println(x.a+x.b);
	}
	public static void main(String[] args)
	{
		Variabeles v=new Variabeles();
		v.m1();
		System.out.println(v.a+v.b);
		System.out.println(Variabeles.c+Variabeles.d);
		v.m2();
		

	}

}
