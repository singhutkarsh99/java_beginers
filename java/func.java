class func
{
	public static int sqr(int n)
	{
		return(n*n);
	}
	public static int qbe(int n)
	{
			int a;
			a=n*n*n;
			return(a);
	}
	public static void main(String args[])
	{
		int x,y,res;
		x=Integer.parseInt(args[0]);
		y=Integer.parseInt(args[1]);
		res=qbe(x)+qbe(y)+3*sqr(x)*y+3*x*sqr(y);
		System.out.println(res);
	}
	
}