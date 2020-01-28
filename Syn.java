import java.util.*;
class Table
{
void printTable(int x)
{
for(int i=0;i<=5;i++)
{
System.out.println(x*i);
try
{
Thread.sleep(500);
}
catch(InterruptedException ie)
{
System.out.println(ie);
}
}
}
}
class MyThreadClass1 extends Thread
{
Table t;
MyThreadClass1(Table t)
{
this.t=t;
}
public void run()
{
t.printTable(5);
System.out.println("Thread 1 Existing");
}
}
class MyThreadClass2 extends Thread
{
Table t;
MyThreadClass2(Table t)
{
this.t=t;
}
public void run()
{
t.printTable(10);
System.out.println("Thread 2 Existing");
}
}
class Syn
{
public static void main(String ar[])
{
Table obj=new Table();
MyThreadClass1 t1=new MyThreadClass1(obj);
MyThreadClass2 t2=new MyThreadClass2(obj);
t1.start();
t2.start();
}
}