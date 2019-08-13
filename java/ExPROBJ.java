import java.util.Scanner;
class matrix
{
	private int num[][];
	public matrix()
	{
		num=new int[3][3];
	}
	
	public matrix(int nor,int noc)
	{
		num=new int[nor][noc];
	}
	
	public void read_matrix()
	{
			Scanner s=new Scanner(System.in);
			int r,c;
			for(r=0;r<num.length;r++)
			{
				for(c=0;c<num[r].length;c++)
				{
					num[r][c]=Integer.parseInt(s.next());
				}
			}
	}
	
	public void print_matrix()
	{
		int r,c;
		for(r=0;r<num.length;r++)
		{
			for(c=0;c<num[r].length;c++)
			{
				System.out.print(num[r][c]+"\t");
			}
			System.out.println("");
		}
	}
	
	matrix add(matrix tmp)
	{
		int r,c;
		matrix res=new matrix(tmp.num.length,tmp.num[0].length);
		//System.out.println(tmp.num.length);
		//System.out.println(tmp.num[0].length);
		for(r=0;r<tmp.num.length;r++)
		{
			for(c=0;c<tmp.num[r].length;c++)
			{
				res.num[r][c]=num[r][c]+tmp.num[r][c];
			}
		}
		return(res);
	}	
}

class ExPROBJ
{
	public static void main(String args[])
	{
		matrix m1=new matrix(4,4);
		matrix m2=new matrix(4,4);
			
			System.out.println("Enter Values for First Matrix");
			m1.read_matrix();
			System.out.println("Enter Values for Second Matrix");
			m2.read_matrix();
			matrix m3=m1.add(m2);
			System.out.println("Sum is ");
			m3.print_matrix();
			
	}
}