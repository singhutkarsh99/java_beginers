class ritdate
{
		private int d,m,y;
		void read_date(int a,int b,int c)
		{
			d=a;
			m=b;
			y=c;
		}
		
		void write_date()
		{
				System.out.println(d+"/"+m+"/"+y);
		}
}

class date
{
	public static void main(String args[])
	{
		ritdate cd=new ritdate();
		ritdate bd=new ritdate();
		
		cd.read_date(11,12,2018);
		bd.read_date(18,04,1977);
		
		//cd.d=14;
		cd.write_date();
		bd.write_date();
		
	}
}