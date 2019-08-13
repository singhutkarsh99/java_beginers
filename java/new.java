import java.util.Scanner;
class function
{
 public static double result=0;
 public void pow(int a,int b)
	{    
	   int ans=1;
	     int j;
		for(j=1;j<=b;j++)
		{
			ans=ans*a;
		} 
		fac(ans,b);
	}

public void fac(int ans,int b)
	{
		int t=1;
		int i;
		
	   for(i=b;i>0;i--)
	   {
			t=t*i;
			
	   }
	  
	   double res=(double)ans/(double)t;
	   add(res);
	}
public static void add(double res)
{
 result=result+res;
}	
}
class solution extends function
{ 
 public void read_detail()
  {
    Scanner s=new Scanner(System.in);
    int p,q;
	System.out.println("Enter X value:-");
	p=Integer.parseInt(s.next());
	System.out.println("Enter y value:-");
	q=Integer.parseInt(s.next());
	for(int i=0;i<q;i++)
	{
		pow(p,i+1);
	}
  }

 public void display()
{
System.out.println("Ans Is:-"+result);
}
}
class inhex
{ public static void main(String args[])
  { solution e=new solution();
    e.read_detail();
	e.display();
	}
	}
  