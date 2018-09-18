interface stack
{
	 
	int[] stk=new int[5];
	void push(int item);
	void pop();
	void display();
}
class stackoper implements stack
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
class inter_stack
{
	public static void main(String args[])
		{
		stackoper s1=new stackoper();
		s1.push(10);
		s1.push(15);
		s1.push(7);
		s1.display();
		s1.pop();
		s1.push(20);
		s1.display();
		}
}