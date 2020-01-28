import java.util.*;
class TLinked
{
public static void main(String ar[])
{
LinkedList l=new LinkedList();
l.add("hello");
l.add("world");
l.add(1,"hiiii");
l.add("WORLD");
l.remove("world");
boolean a=l.contains("hiiii");
for(int i=0;i<l.size();i++)
{
System.out.println(l.get(i));
}
System.out.println(a);
System.out.println(l.peek());
}
}