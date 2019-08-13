class matrixavg
{
	public static void main(String args[])
	{
		int marks[][]=new int[5][4];
		int r,c,i;
		i=0;
		for(r=0;r<5;r++)
		{
			for(c=0;c<4;c++)
			{
				marks[r][c]=Integer.parseInt(args[i]);
				i++;
			}
		}
		int a=0,b=0;
		for(r=0;r<5;r++)
		{ for(c=0;c<4;c++)
			{ b=b+marks[r][c];
		    }
			System.out.println("Total marks of student"+b);
		      b=0;}	
		for(c=0;c<4;c++)
		{
			for(r=0;r<5;r++)
			{ a=a+marks[r][c];
			}
			System.out.println("Average marks of each student"+a/5);
		  a=0;}
	}
}
