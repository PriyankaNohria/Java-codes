import java.util.*;
public class Prac
{
public static void main(String ar[])
{
PriorityQueue<String> s=new PriorityQueue<String>();
s.add("A");
s.add("C");
s.add("A");
s.add("A");
s.add("B");
s.add("A");
s.add("B");
System.out.println(s.poll());
System.out.println(s);
}
}