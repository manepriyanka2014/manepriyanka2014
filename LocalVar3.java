class LocalVar3
{
	public static void main(String args[])
	{
		int n1=10;
		int n2=20;
		int n3=30;
		int n4=40;

		n1=n2;
		n2= n3;
		n3=n4;
		n4=n1;

	System.out.println(n1);//20
	System.out.println(n2);//30
	System.out.println(n3);//40
	System.out.println(n4);//20
	}
}

