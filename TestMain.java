import java.util.Scanner;
class TestThrow
{
void validate(int age)
{
if(age<18)
{
try
{
throw new ArithmeticException("Invalid");
}
catch(ArithmeticException ae)
{
throw ae;
}
}
else
{
System.out.println("You are eligible to Vote");
}}
}
public class TestMain
{
public static void main(String ar[])
{
TestThrow t=new TestThrow();
try
{
t.validate(15);
}
catch(ArithmeticException ae)
{
System.out.println(ae);
}
System.out.println("Main");
}
}