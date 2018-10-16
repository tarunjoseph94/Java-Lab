class thd extends Thread
{
	synchronized public void  run()
	{
		for(int i=20;i<40;i++)
		{
			System.out.println(i);
		}
	}
}
class thd2 extends Thread
{
	synchronized public void  run()
	{
		for(int i=50;i<80;i++)
		{
			System.out.println(i);
		}
	}
}
public class threadsyncro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thd t1=new thd();
		thd2 t2=new thd2();
		t2.start();
		t1.start();
		System.out.println("Main thread exiting");
	}

}
