import java.util.*;
class Deque1
{
public static void main(String ar[])
{
Deque<String> dq=new ArrayDeque<String>();
dq.add("A");
dq.add("B");
dq.add("A");
dq.add("C");
dq.add("B");
dq.offerFirst("first");
dq.offerLast("last");
System.out.println(dq.poll());
Iterator it=dq.descendingIterator();
while(it.hasNext())
{
System.out.println(it.next());
}
} 
}