import java.util.*;
class Stack1
{
public static void main(String ar[])
{
Stack<String> s=new Stack<String>();
s.push("A");
s.push("B");
s.push("A");
s.push("C");
s.push("A");
for(int i=s.size();i>0;i--)
{
System.out.println(s.pop());
}
Stack<Integer> t=new Stack<Integer>();
for(int i=0;i<5;i++)
{
t.push(i);
}
for(int i=0;i<5;i++)
{
System.out.println(t.pop());
}
}
}