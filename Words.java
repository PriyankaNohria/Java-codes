import java.util.Scanner;
class Words
{
public static void main(String ar[])
{
String str=new String();
Scanner obj=new Scanner(System.in);
str=obj.nextLine();
System.out.println(str);
char ch[]=str.toCharArray();
int l=ch.length;
int count=0,count1=0;
for(int i=0;i<l;i++)
{
for(int j=i;j<l;j++)
{
if(ch[j]==' ')
{
break;
}  
else
{
count++;
i++;
}
}
if(count!=0)
{
count1++;
}
count=0;
}
System.out.println(count1);
}
}