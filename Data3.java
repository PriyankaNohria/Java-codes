import java.util.Scanner;
class Data3
{
public static void main(String ar[])
{
Scanner obj=new Scanner(System.in);
String s=obj.next();
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)=='0')
{
for(int j=i+1;j<=s.length();j++)
{
String str=s.substring(i,j);
if(str.charAt(str.length()-1)=='0')
{
System.out.println(str);
}
}
}
}
}
}  