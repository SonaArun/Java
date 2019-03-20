import java.util.*;
class Even implements Runnable
{
  public int x;
  public Even(int x)
  {
    this.x=x;
  }
  public void run()
  {
    System.out.println(x+"is EVEN\nSquare of "+x+"is "+(x*x));
  }
}
class Odd implements Runnable
{
  public int x;
  public Odd(int x)
  {
    this.x=x;
  }
  public void run()
  {
    System.out.println(x+"is ODD\nCube of "+x+"is "+(x*x*x));
  }
}
class A extends Thread 
{
  int n,i;
  Random r=new Random();
 
  public void run() 
  {
  
    for(i=0;i<5;i++)
    {
      n=r.nextInt(100);
      System.out.println("Main Thread Generated Number :: "+n);
     try
      {
      if(n%2 == 0)
      {
        Thread t =new Thread(new Even(n));
        t.start();
        t.sleep(1000);
      }
      else
      {
        Thread t1 =new Thread(new Odd(n));
        t1.start();
        t1.sleep(1000);
      }
    }
    catch(Exception e)
    {
     System.out.println("caught");
    }
    }
  }
}
 
class Demo
{
    public static void main(String args[])
    {
       A a = new A();
        a.start();
        
       
    }
}
