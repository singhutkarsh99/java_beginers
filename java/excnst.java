import java.util.Scanner;
class box
{
	private float d,w,h;
	public box()
	{
		d=1;
		w=1;
		h=1;
	}
	
	public box(float a,float b,float c)
	{
		d=a;
		w=b;
		h=c;
	}
	
	public box(box tmp)
	{
		d=tmp.d;
		w=tmp.w;
		h=tmp.h;
	}
	
	public void set_box()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the depth,width,height");
		d=Float.parseFloat(s.next());
		w=Float.parseFloat(s.next());
		h=Float.parseFloat(s.next());
	}
	float volume()
	{
		return(d*w*h);
	}
}
class excnst
{
	public static void main(String args[])
	{
		box b1=new box();
		box b2=new box();
		
		b2.set_box();
		
		float v;
		v=b1.volume();
		System.out.println(v);
		v=b2.volume();
		System.out.println(v);
		
		box b3=new box(2.5f,7f,5.7f);
		v=b3.volume();
		System.out.println(v);
		
		box b4=new box(b2);
		v=b4.volume();
		System.out.println(v);
	}
}
		