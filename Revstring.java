import java.util.Scanner;
class Revstring
{
public static void main(String ar[])
{
String str=new String();
Scanner obj=new Scanner(System.in);
str=obj.next();
char ch1[]=str.toCharArray();
int l=ch1.length;
char ch2[]=new char[l];
int j=0;
for(int i=l-1;i>=0;i--)
{
ch2[j]=ch1[i];
j++;
}
String str2=new String(ch2);
System.out.println(str2);
}
}