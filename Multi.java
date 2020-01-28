import java.util.Scanner;
interface I1
{
int Area();
}
interface I2
{
int Square();
}
class A implements I1,I2
{
int s;
A(int s)
{
this.s=s;
}
public int Area()
{
return (int)(3.14*s*s);
}
public int Square()
{
return s*s;
}
}
class Multi
{
public static void main(String ar[])
{
I1 t1=new A(2);
I2 t2=new A(3);
System.out.println("Area of Circle : "+t1.Area());
System.out.println("Area of Square : "+t2.Square());
}
}