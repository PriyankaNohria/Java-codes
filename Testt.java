import java.util.Scanner;
class A
{
void fun1()
{
System.out.println("Class A");
}
}
class B extends A
{
void fun1()
{
System.out.println("Class B");
}
}
class Testt
{
public static void main(String ar[])
{
B obj=new B();
obj.fun1();
}
}
