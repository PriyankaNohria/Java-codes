import java.util.*;
class S1
{
public static void main(String ar[])
{
Stack<String> ss=new Stack<String>();
ss.push("A");
ss.push("B");
ss.push("A");
ss.push("C");
ss.push("A");
ss.push("C");
ss.push("A");
int s1=ss.size();
int a=s1/2;
String s=ss.remove(a);
Iterator it=ss.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
}
}