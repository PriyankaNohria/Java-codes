import java.util.Scanner;
class Substring
{
public static void main(String ar[])
{
Scanner obj=new Scanner(System.in);
int count=0;
String s=obj.next();
for(int i=0;i<s.length();i++)
{
for(int j=1;j<s.length()+1-i;j++)
{
String str=s.substring(i,i+j);
char ch[]=str.toLowerCase().toCharArray();
System.out.print(str+" ");
for(int k=0;k<ch.length;k++)
{
if(ch[k]=='a'||ch[k]=='e'||ch[k]=='i'||ch[k]=='o'||ch[k]=='u')
{
count++;
}
}
System.out.println(count);
count=0;
}
}
}
}
