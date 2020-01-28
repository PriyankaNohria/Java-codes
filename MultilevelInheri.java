import java.util.Scanner;
class Student
{
int roll;
void getRoll(int x)
{
roll=x;
}
void putRoll()
{
System.out.println("Roll No. : "+roll);
}
}
class Test extends Student
{
int m1,m2;
void getMark(int x,int y)
{
m1=x;
m2=y;
}
void putMark()
{
System.out.println("Test1 : "+m1);
System.out.println("Test2 : "+m2);
}
}
class Result extends Test
{
void disp()
{
int total;
total=m1+m2;
putRoll();
putMark();
System.out.println("Total : "+total);
}
}
class MultilevelInheri
{
public static void main(String ar[])
{
Result obj=new Result();
obj.getRoll(10);
obj.getMark(95,96);
obj.disp();
}
}