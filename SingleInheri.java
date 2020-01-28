import java.util.Scanner;
class A
{
int a,b;
void get(int x,int y)
{
a=x;
b=y;
}
int add()
{
return (a+b);
}
}
class B extends A
{
int multi()
{
return (a*b);
}
}
class SingleInheri
{
public static void main(String ar[])
{
B obj=new B();
obj.get(5,4);
int res=obj.add();
int res1=obj.multi();
System.out.println("Addition : "+res);
System.out.println("Multiplication : "+res1);
}
}