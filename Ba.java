import java.util.*;
class Ba
{
public static void main(String ar[])
{
Scanner obj=new Scanner(System.in);
String str=obj.next();
char ch[]=str.toCharArray();
Stack<Character> s1=new Stack<Character>();
Stack<Character> s2=new Stack<Character>();
for(int i=0;i<ch.length;i++)
{
if(ch[i]=='['||ch[i]=='{'||ch[i]=='(')
{
s1.push(ch[i]);
}
else if(ch[i]==']'||ch[i]=='}'||ch[i]==')')
{
s2.push(ch[i]);
}else{}}
Stack<Character> s3=new Stack<Character>();
ListIterator it=s2.listIterator(s2.size());
while(it.hasPrevious())
{
s3.add((Character)it.previous());
}
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
int l1=s1.size();
int l2=s2.size();
if(l1==l2)
{
System.out.println("Balanced");
}
else{
System.out.println("Not Balanced");
}
}
}