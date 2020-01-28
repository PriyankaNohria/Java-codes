import java.util.Scanner;
class Data4
{
public static void main(String ar[])
{
StringBuilder s=new StringBuilder();
s.ensureCapacity(10);
String str="helloWorld";
s.append("Javaistechnical");
s.insert(1,str,0,5);
System.out.println(s);
}
}
