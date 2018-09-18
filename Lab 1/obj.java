class box
{
int l;
int b;
}
class obj
{
public static void main(String args[])
{
int a;
box b1=new box();
b1.l=10;
b1.b=5;
a=b1.l*b1.b;
System.out.println("The area is "+a);
}
}