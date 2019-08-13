class addition
{
	public int add(int a ,int b)
	{
		return(a+b);
		
	}
	public int add(int a,int b,int c)
	{
		return(a+b+c);
	}
	public float add(float a,float b)
	{
		return(a+b);
	}
	
	public float add(int a,float b)
	{
		return(a+b);
	}
}

class exfol
{
	public static void main(String args[])
	{
		addition a1=new addition();
		int r=a1.add(5,9,5);
		System.out.println("Sum=\t"+r);
		
		float res=a1.add(2.6f,9.7f);
		System.out.println("Sum=\t"+res);
		

	}
}