import java.util.*;
class Arr
{
public static void main(String ar[])
{
ArrayList<String> l=new ArrayList<String>();
l.add("A");
l.add("B");
l.add("A");
l.add("C");
l.add("D");
l.add("B");
ArrayList<String> l1=new ArrayList<String>();
l1.addAll(l);
ListIterator it=l.listIterator();
while(it.hasPrevious())
{
System.out.println(it.previous());
}
Iterator it1=l.iterator();
while(it1.hasNext())
{
System.out.println(it1.next());
}
System.out.println(l1);
}
}