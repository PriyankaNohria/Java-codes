import java.util.Scanner;
class A
{
void display()
{
System.out.println("class A display");
}
}
class B extends A
{
void display()
{
System.out.println("class B display");
}
}
class C extends B
{
void display()
{
System.out.println("class C display");
}
}
class C2
{
public static void main(String args[])
{
A a=new A();
A b=new B();
A c=new C();
a.display(); 
b.display(); 
c.display(); 
}
}
