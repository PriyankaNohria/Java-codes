import java.util.Scanner;
class Superclass
{
int x=10;
void disp()
{
System.out.println("Superclass : "+x);
}
}
class Sub extends Superclass
{
int y=20;
void disp()
{
System.out.println("Subclass : "+y);
}
}
class Overriding
{
public static void main(String ar[])
{
Sub obj=new Sub();
obj.disp();
}
}