class calsi
{
	public static void main(String args[])
	{
		float a=Float.parseFloat(args[0]);
		
		float b=Float.parseFloat(args[1]);
		char c=args[2].charAt(0);
		float r=0;
		switch(c)
		{
				case '+':
					r=a+b;
					break;
				case '-':
					r=a-b;
					break;
				case 'x':
					r=a*b;
					break;
				case '/':
					if(b==0)
						r=0;
					else
						r=a/b;
					break;
				default:
					r=0;
					
		}
		System.out.println("Result is "+r);
		
	}
}