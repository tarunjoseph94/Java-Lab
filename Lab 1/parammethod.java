class box
 {
 int l;
 int b;
 int area(int len,int bre)
	{
	return len*bre;
	}
 }

class parammethod
 {
	public static void main(String args[])
	{
	int a,l,b;
	box b1=new box();
	l=10;
	b=5;
	a=b1.area(l,b);
	System.out.println("The area is "+a);
	}
 }