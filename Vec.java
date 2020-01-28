import java.util.*;
class Vec
{
public static void main(String ar[])
{
Vector<String> v=new Vector<String>();
System.out.println(v.size()+" "+v.capacity());
v.addElement("A");
v.addElement("B");
v.addElement("A");
v.addElement("C");
v.addElement("A");
System.out.println(v.size()+" "+v.capacity());
v.add("C");
System.out.println(v.size()+" "+v.capacity());
Vector<String> v1=new Vector<String>();
System.out.println(v.elementAt(1));
Iterator it=v.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
Enumeration en=v.elements();
while(en.hasMoreElements())
{
System.out.println(en.nextElement());
}
}
}