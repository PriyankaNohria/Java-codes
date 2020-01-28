import java.util.Scanner;
final class A
{
int x;
void fun()
{
final int k=3;
k=k+1;//ERROR
System.out.println(k);
}
}
class B extends A//ERROR
{

}
class Final2
{
public static void main(String ar[])
{
A obj=new A();
obj.fun();
}
}