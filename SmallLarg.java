import java.util.Scanner;
class SmallLarg
{
public static void main(String ar[])
{
int n;
Scanner obj=new Scanner(System.in);
n=obj.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=obj.nextInt();
}
int b[]=new int[n];
int l;
for(int i=0;i<n-1;i++)
{
if(a[i]<a[i+1])
b[i]=a[i+1];
else
b[i]=0;
}
int k=0;
int c[]=new int[n];
for(int i=n-1;i>0;i--)
{
if(a[i-1]<a[i])
c[i]=a[i-1];
else
c[i]=0;

}
for(int i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
System.out.println();
for(int i=0;i<n;i++)
{
System.out.print((b[i]+c[i])+" ");
}
}
}
