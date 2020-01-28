import java.util.*;
public class Collection
{
public static void main(String ar[])
{
ArrayList l1=new ArrayList(4);
l1.add("Ajay");
l1.add("Rahul");
Iterator it=l1.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
}
} 