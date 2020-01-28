import java.util.*;
public class Practice4
{
public static void main(String ar[])
{
try
{
int a=20,b=10;
int c=a/b;
System.out.println("The Block");
}
catch(ArithmeticException e)
{
System.out.println(e);
}
finally
{
System.out.println("Hello");
}
}
}