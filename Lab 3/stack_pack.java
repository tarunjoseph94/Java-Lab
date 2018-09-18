import stack_operations.pack_stack;
class stack_pack
{
	public static void main(String[] args) {
		pack_stack p1=new pack_stack();
		p1.push(10);
		p1.push(20);
		p1.push(30);
		p1.display();
		p1.pop();
		p1.push(40);
		p1.display();
	}
}