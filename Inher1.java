import java.util.Scanner;
class A
{
int a;
void f1()
{
System.out.println("Superclass");
}
}
class B extends A
{
int b;
void f1()
{
System.out.println("Subclass");
super.f1();
}
}
class Inher1
{
public static void main(String ar[])
{
B obj=new B();
obj.f1();
}
}