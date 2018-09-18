interface Values
{
int a=10;
int b=20;
int c=30;
}
class B implements Values
{
			
int add()
{
return a+b+c;
}	
	
}
class inter_values
{
	public static void main(String args[])
	{
	B b1=new B();
	System.out.println(b1.add());	
	}
}