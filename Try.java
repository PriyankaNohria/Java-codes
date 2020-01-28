import java.util.Scanner;
class Try
{
public static void main(String ar[])
{
try
{
int a=ar.length;
int b=10/a;
System.out.println(a);
try
{
if(a==1)
a=a/(a-a);
if(a==2)
{
int c[]={1,2,3,4,5};
c[10]=10;
}
}
catch(ArrayIndexOutOfBoundsException l)
{
System.out.println(l);
}
}
catch(ArithmeticException ae)
{
System.out.println(ae);
}
System.out.println("After Try-Catch BLock");
}
}