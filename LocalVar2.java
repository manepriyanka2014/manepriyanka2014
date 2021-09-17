class LocalVar2
{
	public static void main(String args[])
	{
		int a=10;
		int b=20;
		int c= a+b;

		System.out.println("1st addition is="+ c);
	
		 a=50;
		 b=60;  //reinitializing
		

		System.out.println("2nd addition is="+ (a+b));

		a=30;
		b=40;    //reinitializing

		System.out.println("addition of "+a+" and "+b+" is="+ (a+b));
	}
}