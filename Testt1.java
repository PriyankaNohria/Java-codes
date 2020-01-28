import java.util.Scanner;
class A
{
public void f1(int x)
{
System.out.println("Class A");
}
}
class B extends A
{
public void f1(int x)
{
System.out.println("Class B");
}
}
class Testt1
{
public static void main(String ar[])
{
B obj=new B();
obj.f1(5);
}
}