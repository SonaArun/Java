import java.util.*;
class calcdemo
{
float a,b;
void add()
{
float sum=a+b;
System.out.println("sum is:\n"+sum);
}
void sub()
{
float diff=a-b;
System.out.println("difference is:\n"+diff);
}
void mul()
{
float product=a*b;
System.out.println("product is:\n"+product);
}
void div()
{
if(b==0)
{
System.out.println("error");
}
else
{
float result=a/b;
System.out.println("quotient is:\n"+result);
}
}
}
class calc
{
public static void main(String args[])
{
int choice;
calcdemo c=new calcdemo();
Scanner sc=new Scanner(System.in);


do
{
System.out.println("Enter your choice:\n1.add\n2.subtract\n3.multiply\n4.division\n");
choice=sc.nextInt();
switch(choice)
{
case 1:System.out.println("Enter two values:\n");
       c.a=sc.nextFloat();
       c.b=sc.nextFloat();
       c.add();
break;
case 2:System.out.println("Enter two values:\n");
       c.a=sc.nextFloat();
       c.b=sc.nextFloat();
      c.sub();
break;
case 3:System.out.println("Enter two values:\n");
       c.a=sc.nextFloat();
       c.b=sc.nextFloat();
       c.mul();
break;
case 4:System.out.println("Enter two values:\n");
       c.a=sc.nextFloat();
       c.b=sc.nextFloat();
       c.div();
break;
default:
System.out.println("invalid choice");
break;
}
}
while(choice<=5);
}
}
