import java.util.Scanner;
class P2
{
public static void main(String ar[])
{
Scanner obj=new Scanner(System.in);
String s=obj.next();
int flag=0;
for(int i=0;i<s.length()/2;i++)
{
if(s.charAt(i)!=s.charAt(s.length()-1-i))
{
flag=1;
break;
}
}
if(flag==0)
System.out.println("Palindrome");
else
System.out.println("Not Palindrome");
}
}