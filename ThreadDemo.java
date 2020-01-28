class MyThread implements Runnable
{
Thread t;
MyThread()
{
t=new Thread(this,"Demo");
t.start();
}
public void run()
{
try
{
for(int i=5;i>0;i--)
{
System.out.println("Child : "+i);
Thread.sleep(500);
}
}
catch(InterruptedException ie)
{
System.out.println("CHILD");
}
}
}
public class ThreadDemo
{
public static void main(String ar[])
{
MyThread mt=new MyThread();
Thread t1=new Thread(mt);
Thread t2=new Thread(mt);
t1.start();
t1.run();
t2.run();
}
}