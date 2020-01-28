import java.util.Scanner;
class TestThrow
{
void validate(int age)
{
if(age<18)
throw new ArithmeticException("Invalid");
else
System.out.println("You are eligible to Vote");
}
}
public class TestMain
{
public static void main(String ar[])
{
TestThrow t=new TestThrow();
t.validate(15);
System.out.println("Main");
}
}