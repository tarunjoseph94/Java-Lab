class box
{
int l;
int b;
box(int len,int bdth)
{
l=len;
b=bdth;
}
}

class paramconstructor
{
public static void main(String args[])
{
int a;
box b1=new box(10,5);
a=b1.l*b1.b;
System.out.println("The area is "+a);
}
}