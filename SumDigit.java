import java.util.Scanner;
class SumDigit
{
public static void main(String ar[])
{
int num,rem,sum=0;
Scanner obj=new Scanner(System.in);
num=obj.nextInt();
while(num!=0)
{
rem=num%10;
sum=sum+rem;
num=num/10;
}
System.out.println(sum);
}
}