import java.util.Scanner;
class Thread1 extends Thread
{
int s,e;
String n;
Thread1(int s,int e,String n)
{
this.s=s;
this.e=e;
this.n=n;
}
public void run()
{
if(n.equals("prime"))
{
int count=0;
for(int i=s;i<=e;i++)
{
for(int j=1;j<=i;j++)
{
if(i%j==0)
count++;
}
if(count==2)
System.out.print(i+" ");
count=0;
}
System.out.println("");
}
else
{
int c=0,a=0,b=0;
for(int i=0;i<e;i++)
{
if(i==0)
{
c=0;
a=0;
}
if(i==1)
{
c=1;
b=1;
}
else
{
c=a+b;
a=b;
b=c;
}
if(c<e&&c>s)
System.out.print(c+" ");
}
System.out.println("");
}
}
}
public class Seats
{
public static void main(String ar[])
{
int s1,e1;
Scanner obj=new Scanner(System.in);
s1=obj.nextInt();
e1=obj.nextInt();
Thread1 t1=new Thread1(s1,e1,"prime");
Thread1 t2=new Thread1(s1,e1,"fibbo");
t1.start();
try
{
t1.join();
}
catch(Exception e)
{
System.out.println("Thread1");
}
t2.start();
try
{
t2.join();
}
catch(Exception e)
{
System.out.println("Thread2");
}
}
}
