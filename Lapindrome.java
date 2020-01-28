import java.util.Scanner;
class Lapindrome
{
public static void main(String ar[])
{
int count=0,count1=0,flag=0;
Scanner obj=new Scanner(System.in);
String s=obj.next();
for(int i=0;i<s.length();i++)
{
for(int j=1;j<s.length()+1-i;j++)
{
String str=s.substring(i,i+j);
count1++;
char ch[]=str.toCharArray();
int l=ch.length;
for(int k=0;k<l/2;k++)
{
if(ch[k]!=ch[l-1])
{
flag=1;
break;
}
}
if(flag==0)
{
count++;
}
flag=0;
}
}
if(count==count1)
{
System.out.println("Lapindrome");
}
else{
System.out.println("Not Lapindrome");
}
}
}