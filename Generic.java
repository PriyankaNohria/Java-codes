import java.util.*;
class Test<T,U>
{
T a;
U b;
Test(T a,U b)
{
this.a=a;
this.b=b;
}
public void print()
{
System.out.println(a);
System.out.println(b);
}
}
public class Generic
{
public static void main(String ar[])
{
Test<String,Integer> iob=new Test<String,Integer>("HelloWorld",55);
iob.print();
}
}
