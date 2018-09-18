class box
{
 int l;
 int b;
  int area(int len,int bdth)
   {
   this.l=len;
   this.b=bdth;
    return l*b;
   }
}

class thiskey
{
 public static void main(String args[])
  {
  int a;
  box b1=new box();
  a=b1.area(10,5);
  System.out.println("The area is "+a);
  }
 }