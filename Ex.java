import java.util.*;
class Ex
{
public static void main(String ar[])
{
ArrayList<String> l=new ArrayList<String>();
l.add("a");
l.add("a");
l.add("a");
l.add("b");
l.add("c");
l.add("c");
l.add("d");
l.add("d");
l.add("d");
l.add("e");
int i=0;
while(i!=(l.size()-1))
{
int a=i;
if(l.get(i)==l.get(i+1))
{
l.remove(i);
i=a;
}
}
Iterator it=l.iterator();
while(it.hasNext())
{
System.out.print(it.next());
}
}
}