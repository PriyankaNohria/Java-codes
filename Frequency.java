import java.util.Scanner;
class Frequency
{
public static void main(String ar[])
{
int n,count=0;
Scanner obj=new Scanner(System.in);
n=obj.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=obj.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(a[j]==i+1)
{
count++;
}
}
System.out.print(count+" ");
count=0;
}
}
}