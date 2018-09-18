interface A
{
void meth1();
}
interface B extends A
{
void meth2();
}
class myclass implements B
{
			
		public void meth1(){
		System.out.println("This is in method 1");
		}
		 public void meth2(){
		System.out.println("This from method 2");
		}

	
}
class inter 
{
	public static void main(String args[])
	{
	myclass c1=new myclass();
	c1.meth1();
	c1.meth2();
		
	}
}