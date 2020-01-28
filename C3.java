class A
{
int x=10;
}
class B extends A
{
int x=20;
}
class C3
{
public static void main(String ar[])
{
A a=new B();
System.out.println(a.x);
}
}