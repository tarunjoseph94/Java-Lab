class Geny<Var,Xar>
{
	Var ob;	
	Xar qb;

Geny(Var dl,Xar d2)
{
	ob=dl;
	qb=d2;
}
void getob()
{
	System.out.println(ob+" "+qb);
	
}
}
public class gen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Geny<Integer,Double> ob=new Geny<>(88,8.5);
		ob.getob();
		
	
	}

}
