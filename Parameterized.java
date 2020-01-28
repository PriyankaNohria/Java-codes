import java.util.Scanner;
class A
{
int a;
A(int x)
{
a=x;
System.out.println(a);
}
}
class B extends A
{
int b;
B(int x,int y)
{
super(x);
b=y;
System.out.println(b);
}
}
class Parameterized
{
public static void main(String ar[])
{
B obj=new B(5,6);
}
}