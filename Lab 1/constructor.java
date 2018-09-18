class box
{
int l;
int b;
box()
{
l=10;
b=5;
}
}

class constructor
{
public static void main(String args[])
{
int a;
box b1=new box();
a=b1.l*b1.b;
System.out.println("The area is "+a);
}
}