class arradd
{
	public static void main(String args[])
	{
			int num[]=new int[10];
			int i;
			int count=0;
			for(i=0;i<10;i++)
			{
				num[i]=Integer.parseInt(args[i]);
			}
			
			for(i=0;i<10;i++)
			{ if (num[i]%2==0)
				{count++;}
			}
			
			System.out.println(count);
	}
}