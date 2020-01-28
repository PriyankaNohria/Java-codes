import java.util.*;
class Practice2
{
public static void main(String ar[])
{
ArrayList<String> l=new ArrayList<String>();
l.add("A");
l.add("B");
l.add("A");
l.add("C");
l.add("B");
l.add("C");
Iterator it=l.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
}
}