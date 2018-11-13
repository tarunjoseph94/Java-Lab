
	enum month{Jan,Feb,Mar,Apr};


public class enum1 {
	public static void main(String[] args) {
		month m=month.Apr;
		System.out.println(m);
		System.out.println("All values");
		for(month m1:month.values())
		{
			System.out.println(m1);
		}
	}	
}

