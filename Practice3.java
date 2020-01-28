import java.util.*;
public class Practice3 
{
public static void main(String ar[])
{
try
{
int a=20,b=10;
int c=a/b;
System.out.println("Try Block");
}
catch(ArithmeticException e)
{
System.out.println(e);
}
finally
{
System.out.println("Finally");
}
System.out.println("After Completion");
}
}