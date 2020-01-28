import java.util.Scanner;
class Test2
{
public static void main(String args[])
{
String str="HelloWorld";
String str1=new String(str);
char ch[]={'J','A','V','A'};
String str2=new String(ch);
String str3=new String(ch,0,2);
int l=str.length();
String str4=str+str1;
char ch1=str.charAt(0);
char ch2[]=new char[20];
str.getChars(0,5,ch2,0);
System.out.println(str);
System.out.println(str1);
System.out.println(str2);
System.out.println(str3);
System.out.println(str4);
System.out.println(ch);
System.out.println(ch1);
System.out.println(ch2);
System.out.println(str.indexOf("l"));
System.out.println(str.lastIndexOf("d"));
}
}