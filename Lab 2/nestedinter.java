class A
{
	public interface Nested
	{
	boolean meth1(int x);
	}
}
class B implements A.Nested
{
			
		public boolean meth1(int x){
		return x<0?false:true;
		}
		
	
}
class nestedinter 
{
	public static void main(String args[])
	{
	A.Nested b1=new B();
	if(b1.meth1(-10))
	{
	System.out.println("Something");
	}	
	else
	{
	System.out.println("Something Else");
	}
		
	}
}