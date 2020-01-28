import java.util.Scanner;
class EvenSubstring
{
public static void main(String ar[])
{
Scanner obj=new Scanner(System.in);
String str=obj.next();
for(int i=0;i<str.length();i++)
{
for(int j=1;j<str.length()+1-i;j++)
{
String s=str.substring(i,i+j);
System.out.println("SubString : "+s);
int k=Integer.parseInt(s);
if(k%2==0)
{
System.out.println(k+" is Even");
}
}
}
}
}