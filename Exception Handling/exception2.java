
public class exception2 {

	public static void main(String[] args) {
		
			
			try
			{
				int a=15;
				if(a<18)
				{
			throw new ArithmeticException("Underage3"
					+ "");
				}
			}
			
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			
			
			}
		}