class facfun
{
	public static int pow(int a,int b)
	{    int i=1;
	     int j;
		for(j=1;j<=b;j++)
		{
			i=i*a;
		} return(i);
	}
	public static int fac(int l)
	{
		int t=1;
		int i;
	   for(i=l;i>0;i--)
	   {
			t=t*i;
			
	   }return(t);
	}
	public static void main(String args[])
	{
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		int i;
		float res;
		res=0;
		for(i=1;i<=y;i++)
		{ 
			res=(float)pow(x,i)/fac(i)+res;
		}
		System.out.println(res);
	}
}
