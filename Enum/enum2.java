
	enum mth{Jan(1),Feb(2),Mar(3),Apr(4);
	 int value;
		 mth(int value)
		{
			this.value=value;
		}};
	

public class enum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(mth m1:mth.values())
		{
			System.out.println(m1+" "+m1.value);
		}
	}

}
