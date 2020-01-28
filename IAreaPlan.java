import java.util.Scanner;
interface IArea
{
int sArea();
int cArea();
}
class CSquare implements IArea
{
int s;
CSquare(int s)
{
this.s=s;
}
public int sArea()
{
return s*s;
}
public int cArea()
{
return 0;
}
}
class CArea implements IArea
{
int r;
CArea(int r)
{
this.r=r;
}
public int sArea()
{
return 0;
}
public int cArea()
{
return (int)(3.14*r*r);
}
}
class IAreaPlan
{
public static void main(String ar[])
{
IArea t1=new CSquare(5);
System.out.println("Area of Square : "+t1.sArea());
IArea t2=new CArea(4);
System.out.println("Area of Circle : "+t2.cArea());
}
}