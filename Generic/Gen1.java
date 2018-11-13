class Gen<Var>
{
	Var ob;	

Gen(Var dl)
{
	ob=dl;
}
Var getob()
{
	return ob;
}
}
public class Gen1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen<Integer> ob=new Gen<Integer>(88);
		Gen<Double> ob2=new Gen<Double>(8.5);
		System.out.println(ob.getob());
		System.out.println(ob2.getob());
		
	}

}
