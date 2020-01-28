import java.util.*;
class Practice11
{
public static void main(String ar[])
{
Scanner obj=new Scanner(System.in);
int n=obj.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=obj.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(a[i]+a[j]==5)
System.out.println(a[i]+","+a[j]);
}
}
}
}