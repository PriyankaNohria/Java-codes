import java.util.*;
import java.Collections;
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
for(int i:l){
System.out.println(i);
}
}

  private Node first;

public void insert(int key){
 first=insert(first,key);
}

public void insert(Node n,int key){
if(n==null)
return new Node(key);
n.next=insert(n.next,key);
return n;  
   }



 private class Node{
  private int key;
  private Node next;
  public Node(int key){
     this.key=key;   
    }
   }
}
}