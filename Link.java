import java.util.*;
class Link
{
public static void main(String ar[])
{
ArrayList<String> al=new ArrayList<String>();
ArrayList<String> l=new ArrayList<String>();
al.add("A");
al.add("B");
al.add("A");
al.add("C");
al.add("A");
al.add("C");
for(int i=0;i<al.size();i++)
{
if(l.contains(al.get(i)))
{}
else{
l.add(al.get(i));
}
}
for(int i=0;i<l.size();i++)
{
System.out.println(l.get(i));
}
for(int i=0;i<al.size();i++)
{
for(int j=i+1;j<al.size();j++)
{
if(al.get(i)==al.get(j))
al.remove(j);
}
}
Iterator it=al.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
}
}