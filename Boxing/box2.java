class Boxy
{
	int m;
Boxy(int x)
{
	m=x;
}
void pnt()
{
	System.out.println(m+"Default");
}
void pnt(int x)
{
	System.out.println(x+"Int");
}
void pnt(Integer x)
{
	System.out.println(x+"Integer");
}

}
public class box2 {
	public static void main(String[] args) {
	// Boxing
	Integer a=new Integer(5);
	Integer b=new Integer(10);
	Integer c=a+b;
	System.out.println(c);
	// Unboxing
	int d=a+b;
	System.out.println(d);
	
	Boxy b1=new Boxy(c);
	Boxy b2=new Boxy(d);
	b1.pnt();
	b1.pnt(c);
	b1.pnt(d);
	b2.pnt();
	b2.pnt(d);
	b2.pnt(c);
}
}
