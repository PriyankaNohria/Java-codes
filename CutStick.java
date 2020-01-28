import java.util.Scanner;
class CutStick
{
public static void main(String ar[])
{
Scanner obj=new Scanner(System.in);
int n,count=0;
n=obj.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=obj.nextInt();
count++;
}
System.out.println(count);
for(int i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
System.out.println();
int lr=-100;
for(int i=0;i<n;i++)
{
if(lr<a[i])
{
lr=a[i];
}
}
int j=0,c=0;
for(j=0;j<lr;j++)
{
int sm=100;
for(int i=0;i<n;i++)
{
if(sm>a[i]&&a[i]!=0)
{
sm=a[i];
}
}
for(int i=0;i<n;i++)
{
if(a[i]!=0)
a[i]=a[i]-sm;
if(a[i]!=0)
{
c++;
}
}
for(int i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
System.out.println();
System.out.println(c);
if(c==0)
break;
c=0;
j++;
}
}
}