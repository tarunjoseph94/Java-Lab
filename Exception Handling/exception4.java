import java.util.*;

class underAgeException extends Exception
{
	public underAgeException(String s){
		super(s);
	}
}
public class exception4 {

	public static void main(String[] args) {
		
		int a=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your age");
		a=in.nextInt();
		in.close();
		try{
			if(a<18)
			{
				throw new underAgeException("You are underage");
			}
			else
			{
				System.out.println("Continue");
			}
		}
		catch(underAgeException x)
		{
			System.out.println(x);
		}
		
	}

}
