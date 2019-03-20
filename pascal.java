import java.util.*;
class pascal
{
public static void main(String args[])
{
System.out.println("Enter the number of lines:\n");
Scanner sc=new Scanner(System.in);
int no=sc.nextInt();
int spaces=no;
int number=1;
for(int i=0;i<no;i++)
{
for(int s=1;s<=spaces;s++)
{
System.out.print(" ");
}
number=1;
for(int j=0;j<=i;j++)
{
System.out.print(number+" ");
number=number*(i-j)/(j+1);
}
spaces--;
System.out.println();
}
}
}
