import java.util.Scanner;
class Super
{
void fun1(int x)
{
System.out.println("Class A");
}
}
class Sub extends Super
{
void fun1(int x,int y)
{
System.out.println("Class B");
}
}
class Overloading
{
public static void main(String ar[])
{
Sub obj=new Sub();
obj.fun1(5);
obj.fun1(2,3);
}
}