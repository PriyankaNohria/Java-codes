import java.util.*;
class TQueue
{
public static void main(String ar[])
{
PriorityQueue pq=new PriorityQueue();
pq.add("A");
pq.add("C");
pq.add("D");
pq.add("B");
System.out.println(pq); 
System.out.println(pq.poll());
System.out.println(pq.poll());
System.out.println(pq.poll());
System.out.println(pq.poll());
System.out.println(pq);
}
}