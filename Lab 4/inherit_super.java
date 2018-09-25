
import java.util.*;

class supercl
{
	int s;
	Scanner in=new Scanner(System.in); 
	supercl()
	{
		System.out.println("Enter a number");
		s=in.nextInt();
	}
	void display()
	{
		System.out.println("The number entered in super is "+s);
	}
}
class sub1 extends supercl
{
	int s=10;
	sub1()
	{
		
	}
	void display()
	{
		System.out.println("The number entered is "+s);
		System.out.println("The number entered in the superclass is "+super.s);
		//                                      displays super class variables 
		
		super.display();
		//displays superclass's function which is overridden
	}
	
}
class sub2 extends sub1
{
	int s=15;
	
	void display()
	{
		System.out.println("The number entered is "+s);
		System.out.println("The number entered in the superclass is "+super.s);
		//                                      displays sub1 variables 
		
		super.display();
		//displays sub1's function which is overridden
		//which then in turn displays superclass function because of the code 
	}
	
}

public class inherit_super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sub1 s1=new sub1();
		s1.display();
		sub2 s2=new sub2();
		s2.display();
		

	}

}
