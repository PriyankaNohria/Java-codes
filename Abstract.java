import java.util.Scanner;
abstract class Figure
{
int l,b;
Figure(int l,int b)
{
this.l=l;
this.b=b;
}
abstract int area();
}
class Rectangle extends Figure
{
Rectangle(int l,int b)
{
super(l,b);
}
int area()
{
return l*b;
}
}
class Triangle extends Figure
{
Triangle(int l,int b)
{
super(l,b);
}
int area()
{
return ((l*b)/2);
}
}
class Abstract
{
public static void main(String ar[])
{
Figure a1=new Rectangle(3,4);
System.out.println(a1.area());
Figure a2=new Triangle(3,4);
System.out.println(a2.area());
}
}