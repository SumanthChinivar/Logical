package polymorphism;

public class M1 {

	static void print()
	{
		System.out.println("Parent");
	}
}

class M2 extends M1
{
	public static void print()
	{
		System.out.println("Child");
	}
}