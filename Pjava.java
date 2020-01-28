import java.util.*;
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
Rectangle(int x,int y)
{
super(x,y);
l=x;
b=y;
}
public int area()
{
 return (l*b);
}
}
class Triangle extends Figure
{
Triangle(int x,int y)
{
super(x,y);
l=x;
b=y;
}
public int area()
{
return (l*b)/2;
}
}
public class Pjava
{
public static void main(String ar[])
{
Scanner obj=new Scanner(System.in);
Figure t1=new Rectangle(2,3);
System.out.println("Area of Rectangle : "+t1.area());
Figure t2=new Triangle(2,3);
System.out.println("Area of Triangle : "+t2.area());
}
}