import java.util.*;
class rectangle
{
int length;
int bredth;
void area()
{
System.out.println("Area is"+length*bredth);
}
}
class area
{
public static void main(String args[])
{
rectangle r1=new rectangle();
rectangle r2=new rectangle();
System.out.println("Enter the length and bredth of first rectangle:\n");
Scanner sc=new Scanner(System.in);
r1.length=sc.nextInt();
r1.bredth=sc.nextInt();
r1.area();
System.out.println("Enter the length and bredth of second rectangle:\n");
r2.length=sc.nextInt();
r2.bredth=sc.nextInt();
r2.area();
}
}
