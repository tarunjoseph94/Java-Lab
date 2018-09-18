package stack_operations;
interface stack
{
	 
	int[] stk=new int[5];
	void push(int item);
	void pop();
	void display();
}
public class pack_stack implements stack
{
	int i;
	int top=-1;
	int item=0;
	
	public void push(int it)
	{
		System.out.println("Pushing "+it+" in the Stack");
		++top;
		stk[top]=it;
	}
	public  void pop()
	{
		item=stk[top];
		--top;
		System.out.println("The item popped is "+item);
	
	}
	public  void display()
	{
		System.out.println("Displaying the Stack");	
		for(i=0;i<=top;i++)
		{
			System.out.println(stk[i]);
		}

	}
}
//in the console  javac -d . classname.java
//Then in the console 
//set classpath="Path to package"(Test this not sure)
