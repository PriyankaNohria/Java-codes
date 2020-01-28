import java.util.*;
abstract class Base
{
abstract void disp();
void display()
{
System.out.println("Base Function Called");
}
}
class Derived extends Base
{
void disp()
{
System.out.println("Derived Function Called");
}
}
class Pra11
{
public static void main(String ar[])
{
Derived b=new Derived();
b.disp();
b.display();
}
}