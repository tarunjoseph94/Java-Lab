interface A
{
  void meth1();
}
interface B extends A
{
default void meth2()
{
System.out.println("This is default");
}
}
class myclass implements B
{
			
		public void meth1(){
		System.out.println("This is in method 1");
		}
		//remove this function to display default fuction
		public void meth2(){
		System.out.println("This is in method 2");
		}
		

	
}
class default_inter 
{
	public static void main(String args[])
	{
	myclass c1=new myclass();
	c1.meth1();
	c1.meth2();
		
	}
}