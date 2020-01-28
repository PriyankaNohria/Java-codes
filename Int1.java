import java.util.Scanner;
interface A
{
int roll=10;
void dispA();
}
interface B
{
void dispB();
}
class C implements A,B
{
public void dispA()
{
System.out.println("Roll No. : "+roll);
}
public void dispB()
{
System.out.println("Method of Interface B");
}
}
class Int1
{
public static void main(String ar[])
{
C obj=new C();
obj.dispA();
obj.dispB();
}
}