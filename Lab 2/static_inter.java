interface A
{
 static void meth1()
{
System.out.println("This is default");
}
}
interface B 
{
 void meth2();

}
class myclass implements B
{
			
		
		//remove this function to display default fuction
		public void meth2(){
		System.out.println("This is in method 2");
		}
		

	
}
class static_inter 
{
	public static void main(String args[])
	{
	myclass c1=new myclass();
	c1.meth1();
	c1.meth2();
		
	}
}