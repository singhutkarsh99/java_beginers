import java.util.Scanner;

class family
{
	private static int fid;
	private int mid,age;
	private String mnm;
	
	public static void read_fid()
	{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Family ID");
			fid=Integer.parseInt(s.next());
	}
	
	public void read_details()
	{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Member ID");
			mid=Integer.parseInt(s.next());
			System.out.println("Enter Member Name and Age");
			mnm=s.next();
			age=Integer.parseInt(s.next());
	}
	public void get_details()
	{
		System.out.println("Family ID 	: "+fid);
		System.out.println("Member ID 	: "+mid);
		System.out.println("Member Name : "+mnm);
		System.out.println("Member Age 	: "+age);
	}
}

class staticex
{
		public static void main(String args[])
		{
			family f1=new family();
			family f2=new family();
			
			family.read_fid();
			
			f1.read_details();
			f2.read_details();
			
			f1.get_details();
			f2.get_details();
		}
}