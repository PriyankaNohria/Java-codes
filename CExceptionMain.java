import java.io.*;
class CException extends Exception
{
String msg;
CException(String msg)
{
this.msg=msg;
}
public String toString()
{
return msg;
} 
}
public class CExceptionMain
{
static void check(int age) throws CException
{
if(age<0)
throw new CException("Age cannot be negative");
else
System.out.println("Valid");
}
public static void main(String ar[])
{
try
{
check(-5);
}
catch(CException ce)
{
System.out.println(ce);
}
}
}