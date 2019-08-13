class biggest3
{
	public static void main(String args[])
	{
		byte a,b;
		a=50;
		b=20;
		int c=55;
		if(a>b)
		{
			if(a>c)
				System.out.println(a+" is biggest");
			else
				System.out.println(c+" is biggest");
		}
		else
		{
			if(b>c)
				System.out.println(b+" is biggest");
			else
				System.out.println(c+" is biggest");
		}
	}
}
		