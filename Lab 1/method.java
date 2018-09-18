class box
{
int l;
int b;
box(int len,int bdth)
{
l=len;
b=bdth;
}
void area()
{
int a;
a=l*b;
System.out.println("The area is "+a);

}
}

class method
{
public static void main(String args[])
{
int a;
box b1=new box(10,5);
b1.area();
}
}