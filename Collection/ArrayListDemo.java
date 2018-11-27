import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		Iterator<Integer> it=al.iterator();
		System.out.println(al);
		
		System.out.println("Using itertaor");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
