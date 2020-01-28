import java.util.Scanner;
class A
{
A()
{
System.out.println("A");
}
}
class B extends A
{
B()
{
super();
System.out.println("B");
}
}
class Default
{
public static void main(String ar[])
{
B obj=new B();
}
}