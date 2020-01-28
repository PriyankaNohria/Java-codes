import java.util.*;
class Mapp
{
public static void main(String ar[])
{
HashMap<Integer,String> hm=new HashMap<Integer,String>();
hm.put(1,"A");
hm.put(3,"D");
hm.put(4,"E");
hm.put(2,"C");
hm.replace(1,"A","First");
Set s=hm.entrySet();
Iterator it=s.iterator();
while(it.hasNext())
{
Map.Entry e=(Map.Entry)it.next();
System.out.println(e.getKey()+"  "+e.getValue());
}
System.out.println("*****************");
for(Map.Entry e:hm.entrySet())
{
System.out.println(e.getKey()+"  "+e.getValue());
}
System.out.println("*****************");
System.out.println(hm.entrySet());
}
}