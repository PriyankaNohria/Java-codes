import java.util.*;
public class Pra1
{
public static void main(String ar[])
{
Scanner obj=new Scanner(System.in);
String str1="hello";
String str2="world";
System.out.println(str1+str2);
System.out.println(str1+1);
System.out.println(1+str1);
System.out.println(str1+1+2);
System.out.println(1+2+str1);
System.out.println(str1+1+str2);
System.out.println(str1.concat(str2));
System.out.println(str2.concat(str1));
char ch[]={'J','A','V','A'};
String str4=new String(ch);
String str3=new String(ch,0,2);
System.out.println(str3);
System.out.println(str4);
}
}