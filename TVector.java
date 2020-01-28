import java.util.*;
class TVector
{
public static void main(String ar[])
{
Vector<Integer> v=new Vector<Integer>();
v.add(1);
v.add(2);
v.add(3);
v.add(1,4);
Stack s=new Stack();
s.push("hello");
s.push("world");
s.push("hiiii");
s.pop();
for(int i=0;i<v.size();i++)
{
System.out.println(v.get(i));
}
System.out.println("************");
for(int i=0;i<s.size();i++)
{
System.out.println(s.get(i));
}
}
}