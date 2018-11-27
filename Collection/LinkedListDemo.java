import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		Iterator<Integer> it=l1.iterator() ;
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
