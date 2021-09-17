class Global2
{
	static int a=10;
	static int b=20;
}
Class TestGlobal2
{
	static int a=55;
	static int b=65;
	
	public static void main(String args[])
	{

	System.out.println(a);
	System.out.println(Global2.a);
}
}