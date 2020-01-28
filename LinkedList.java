import java.util.*;

public class LinkedList implements Iterable<Integer>
{

public static void main(String ar[])
{
LinkedList l=new LinkedList();
l.insert(1);
l.insert(2);
l.insert(3);
l.insert(4);
l.insert(5);
l.print();

for(int i:l){
System.out.println(i);
}

Iterator it=l.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}

}

  private Node first;

public void insert(int key){
 first=insert(first,key);
}

public Node insert(Node n,int key){
if(n==null)
return new Node(key);
n.next=insert(n.next,key);
return n;  
   }

void print(){
Node temp=first;
while(temp!=null){
System.out.print(temp.key+"->");
temp=temp.next;
}
System.out.println("null");
}

 private class Node{
  private int key;
  private Node next;
  public Node(int key){
     this.key=key;   
    }
   }

public Iterator<Integer> iterator(){
  return new MyIterator();
}

private class MyIterator implements Iterator<Integer>{
    private Node temp=first;
    public boolean hasNext(){
    return temp!=null;
  } 
public Integer next(){
   int t=temp.key;
   temp=temp.next;
   return t;
    }
}

}