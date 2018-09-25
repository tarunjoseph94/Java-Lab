class box {
int d,w,l;
}

 class mybox extends box {
	mybox(int length,int width,int depth)
	{
		l=length;
		w=width;
		d=depth;
	}
	int volume()
	{
		return l*w*d;
	}

}


public class inherit1 {

	public static void main(String[] args) {
		mybox b1=new mybox(10,10,10);
		System.out.println("The volume is  "+b1.volume());
	}

}
