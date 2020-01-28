import java.util.Scanner;
class Student
{
int m1,m2;
void getmarks(int x,int y)
{
m1=x;
m2=y;
}
void putmarks()
{
System.out.println("mark1 : "+m1);
System.out.println("mark2 : "+m2);
}
}
interface Sport
{
int sp=90;
void spmark();
}
class Result extends Student implements Sport
{
public void spmark()
{
System.out.println("Sport Marks : "+sp);
}
void disp()
{
putmarks();
spmark();
int total=m1+m2+sp;
System.out.println("Total Marks : "+total);
}
}
class Int2
{
public static void main(String ar[])
{
Result r=new Result();
r.getmarks(93,94);
r.disp();
}
}