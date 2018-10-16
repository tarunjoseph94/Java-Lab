
public class excpetion1 {
public static void main(String[] args)
	{
	int a;
	try
	{
		a=10/0;
	
	}
	
	catch(ArithmeticException e)
	{
		System.out.println("Cant divide by 0");
	}
	finally
	{
		System.out.println("End  ");
	}
	
	}
}
