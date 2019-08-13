import java.util.Scanner;
class empdet
{
	private int eid;
	private String ename,post;
	public  void read_detail()
	{   Scanner s=new Scanner(System.in);
			System.out.println("Enter employ ID");
			eid=Integer.parseInt(s.next());
			System.out.println("Enter employ Name");
			ename=s.next();
			System.out.println("Enter post");
            post=s.next();
	}
	public void write_detail()
	{    System.out.println("Employ ID : "+eid);
		 System.out.println("employ name: "+ename);
		 System.out.println("employ post: "+post);
	}
}
class employ
{     public static void main(String args[]) 
	{
int	size=Integer.parseInt(args[0]);
      empdet emp[]=new empdet[size];
	  int i;
	  for(i=0;i<size;i++)
		  emp[i]=new empdet();
	  

	 for(i=0;i<size;i++)
		  emp[i].read_detail();
	  
	  for(i=0;i<size;i++)
	  {
		  System.out.println("Details of "+(i+1));
			emp[i].write_detail();
	  }
	  
		  
	}
}