import java.util.Scanner;
import java.lang.*;
class Account
{
int an,pn;
String amt;
Account(int an,int pn,String amt)
{
this.an=an;
this.pn=pn;
this.amt=amt;
}
void validate(String amount)
{
String reg="[0-9]";
int flag=0;
try
{
char ch[]=amount.toCharArray();
for(int i=0;i<ch.length;i++)
{
if(String.valueOf(ch[i]).matches(reg))
{
flag++;
}
}
if(flag==0)
throw new Exception("Invalid");
else
System.out.println("Enter the deposit amount : "+amount);
}
catch(Exception ae)
{
System.out.println("Enter valid amount");
Scanner obj=new Scanner(System.in);
amt=obj.next();
}
}
void display()
{
System.out.println(an+"  "+amt);
}
int getAn()
{
return an;
}
int getPn()
{
return pn;
}
String getAmt()
{
return amt;
}
}
public class TestEx
{
public static void main(String ar[])
{
String option="yes";
do
{
Scanner t=new Scanner(System.in);
System.out.println("Enter the Account number");
int a=t.nextInt();
System.out.println("Enter the PIN number");
int p=t.nextInt();
System.out.println("Enter the Deposit Amount");
String d=t.next();
Account t1=new Account(a,p,d);
t1.validate(d);
t1.display();
System.out.println("Do another transaction(yes/no)");
option=t.next();
}while(option=="yes");
}
}