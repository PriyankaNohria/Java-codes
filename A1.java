import java.util.*;
class A1
{
public static void main(String ar[])
{
Scanner obj=new Scanner(System.in);
String str=obj.next();
fun(str,0);
}
static void fun(String s,int i)
{
if(i==s.length())
return;
fun(s,i+1);
System.out.print(s.charAt(i));
}
}