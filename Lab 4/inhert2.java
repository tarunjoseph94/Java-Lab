
 class superclass {
	superclass()
	{
	System.out.println("This is Superclass");
	}
	void funct1()
	{
		System.out.println("This is Superclass function");
		
	}
}

 class subclass1 extends superclass {
	subclass1()
	{
		System.out.println("This is from subclass1");
	}
	void funct1()
	{
		System.out.println("This is from subclass1 function");
	}
}

 class subclass2 extends subclass1 {
	subclass2()
	{
		System.out.println("This is from subclass2");
	}
	void funct1()
	{
		System.out.println("This is from subclass2 function");
	}
}

 class inhert2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superclass r;
		subclass2 s2= new subclass2();
		s2.funct1();

		r=s2;
		r.funct1();
		
		
		subclass1 s1=new subclass1();
		r=s1;
		r.funct1();

		superclass sup=new superclass();
		r=sup;
		r.funct1();
	}

}