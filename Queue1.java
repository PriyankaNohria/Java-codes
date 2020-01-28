import java.util.*;
class Queue1
{
public static void main(String ar[])
{
Queue<String> s=new LinkedList<String>();
s.add("A");
s.add("B");
s.add("A");
s.add("C");
s.add("A");
Iterator it=s.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
System.out.println("Element() : "+s.element());
System.out.println("Remove() : "+s.remove());
System.out.println(s);
}
}