class Trd extends Thread
{
	public void run()
	{
	for(int i=0;i<5;i++)
	{
		System.out.println(i);
	}
	}
}
class Trd2 extends Thread
{
	public void run()
	{
	for(int i=10;i<15;i++)
	{
		System.out.println(i);
	}
	}
}
public class thread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trd t=new Trd();
		Trd2 t2=new Trd2();

		t.start();
		t2.start();
		t.setPriority(5);
		t2.setPriority(4);
		try
		{
//			t.join();
			t2.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interupted");
		}
		System.out.println("Main thread exiting");
				
	}

}

