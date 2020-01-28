import java.util.Scanner;
class A
{
A()
{
System.out.println("Default constructor A");
}
A(String str)
{
System.out.println("Parameterized constructor A "+str);
}
}
class B extends A
{
B()
{
System.out.println("Default constructor B");
}
B(String str)
{
super(str);
System.out.println("Parameterized constructor B "+str);
}
}
class C1
{
public static void main(String ar[])
{
B b1=new B();
B b=new B("java");
}
}