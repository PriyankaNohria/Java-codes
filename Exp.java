import java.util.*;
class Exp
{
public static  void main(String ar[])
{
int bal=5000;
int w=30000;
try
{
if(bal<w)
throw new ArithmeticException("Insufficient Balance");
bal=bal-w;
System.out.println("Transaction Successfull");
}
catch(ArithmeticException ae)
{
System.out.println(ae);
}
System.out.println("Program Continue........");
}
}