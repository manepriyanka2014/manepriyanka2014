class Sample5
{
	static int a=48;
	static int b=21;
	static ingt c;

}
class Sample6
{
	static int a;
	static int b;
	static int c=42;
}
class TestSample5_6
{
	static int a;
	static int b;
	public static void main(String args[])
	{
	System.out.println("main method started");
	System.out.println(a);
	System.out.println(b);
	System.out.println(Sample5.a);
	System.out.println(Sample5.b);
	System.out.println(Sample6.a);
	System.out.println(Sample6.c);

	
	Sample5.c=a;
	Sample6.a=Sample5.b;
	Sample6.b=Sample5.a;
	System.out.println(a);
	System.out.println(Sample5.a);
	System.out.println(Sample5.c);
	System.out.println(Sample6.a);
	System.out.println(Sample6.b);
	System.out.println("main method end");
	}
}
	





	
	