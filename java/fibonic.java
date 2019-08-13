class fibonic
{
	public static void main(String args[])
	{
		int x=-1,y=1,z=0;
		do
		{
			z=x+y;
			System.out.print(z+"\t");
			x=y;
			y=z;
		}while(z<100);
	}
}