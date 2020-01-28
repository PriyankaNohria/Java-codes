import java.io.*;
class ThrowsDemo
{
void method() throws IOException
{
System.out.println("Throws");
throw new IOException("File not Found");
}
}
public class ThrowDemoMain
{
public static void main(String ar[]) 
{
try
{
ThrowsDemo t=new ThrowsDemo();
t.method();
}
catch(Exception e)
{
System.out.println("Caught"+e);
}
}
}