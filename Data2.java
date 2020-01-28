import java.util.Scanner;
class Data2
{
public static void main(String ar[])
{
Scanner obj=new Scanner(System.in);
String str=obj.nextLine();
String ch[]=str.split(" ");
for(int i=0;i<ch.length;i++)
{
System.out.println(ch[i]);
}
}
}