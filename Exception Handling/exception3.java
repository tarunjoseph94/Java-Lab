class div
{
int a;

void divide()throws ArithmeticException
	{
	a=10/0;
	}
}
public class exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			div d=new div();
			d.divide();
		}
		catch(ArithmeticException e)
		{
			System.out.println("There is an excpetion");
		}
	}

}
