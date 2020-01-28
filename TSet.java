import java.util.*;
class TSet
{
public static void main(String ar[])
{
TreeSet s=new TreeSet();
s.add("B");
s.add("D");
s.add("A");
s.add("C");
System.out.println(s);
System.out.println(s.first());
System.out.println(s.last());
System.out.println(s.headSet("C"));
System.out.println(s.tailSet("C"));
System.out.println(s.subSet("B","D"));
System.out.println(s.comparator());
System.out.println(s.ceiling("C"));
System.out.println(s.floor("C"));
System.out.println(s.higher("C"));
System.out.println(s.lower("C"));
System.out.println(s.pollFirst());
System.out.println(s.pollLast());
System.out.println(s);
}
}