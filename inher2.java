import java.util.Scanner;
class A
{
int z;
void fun(){}
}
class B extends A
{
int z;
public void f2()
{
int z;
super.z=3;
this.z=4;
z=5;
System.out.println(super.z);
System.out.println(this.z);
System.out.println(z);
}
}
class Inher2
{
public static void main(String ar[])
{
B obj=new B();
obj.f2();
}
}