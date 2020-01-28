import java.util.Scanner;
class StringRotate
{
public static void main(String ar[])
{
String s;
Scanner obj=new Scanner(System.in);
s=obj.next();
char ch[]=s.toCharArray();
int l=ch.length;
char t=ch[l-1];
for(int i=l-1;i>0;i--)
{
ch[i]=ch[i-1];
}
ch[0]=t;
String st=new String(ch);
System.out.println(st);
}
}