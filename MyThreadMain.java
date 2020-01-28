class MyThread implements Runnable
{
String name;
Thread t;
MyThread(String s)
{
name=s;
t=new Thread(this,name);
System.out.println("New Thread : "+t);
}
public void run()
{
try
{
for(int i=0;i<5;i++)
{
System.out.println("name : "+i);
Thread.sleep(1000);
}
}
catch(Exception e)
{
System.out.println(name+e);
}
System.out.println(name+"Exit");
}
}
class NewThreadMain
{
public static void main(String ar[])
{
MyThread t1=new MyThread("One");
MyThread t2=new MyThread("Two");
MyThread t3=new MyThread("Three");
t1.t.start();
System.out.println("t1.t.isAlive");
try
{
t1.t.join();
}
catch(Exception e)
{
System.out.println(e);
}
t2.t.start();
System.out.println("t2.t.isAlive");
try
{
t2.t.join();
}
catch(Exception e)
{
System.out.println(e);
}
t3.t.start();
System.out.println("t3.t.isAlive");
try
{
t3.t.join();
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println(t1.t.isAlive());
System.out.println(t2.t.isAlive());
System.out.println(t3.t.isAlive());
}
}