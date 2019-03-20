import java.util.*;
class sort
{
int n;
void sorting(int a[],int n)
{
int i,j,temp;
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("sorted array is:\n");
for(i=0;i<n;i++)
{
System.out.print(a[i]+",");
}
//System.out.print(a[n-1]);
}
}

class arraysort
{
public static void main(String args[])
{
int i;
sort s=new sort();
System.out.println("enter the number of array elements:\n");
Scanner sc=new Scanner(System.in);

s.n=sc.nextInt();
int a[]=new int [s.n];
System.out.println("enter the array elements:\n");
for(i=0;i<s.n;i++)
{
a[i]=sc.nextInt();
}
s.sorting(a,s.n);
}
}
