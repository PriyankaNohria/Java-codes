import java.util.Scanner;
class StringConcat
{
public static void main(String ar[])
{
int n=50;
String str1="Easy"+"tuts4you";
String str2=str1+" Channel";
String str3=str1+str2;
String str4=n+10+str1;
String str5=str1+n+10;
String str6=str1.concat(" Channel");
String str7="My ".concat(str6);
System.out.println("String 1 : "+str1); 
System.out.println("String 2 : "+str2); 
System.out.println("String 3 : "+str3); 
System.out.println("String 4 : "+str4); 
System.out.println("String 5 : "+str5); 
System.out.println("String 6 : "+str6); 
System.out.println("String 7 : "+str7);
}
} 