import java.util.Scanner;
class Diagonal
{
public static void main(String ar[])
{
int r,c;
Scanner obj=new Scanner(System.in);
r=obj.nextInt();
c=obj.nextInt();
int a[][]=new int[r][c];
int sum=0;
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
a[i][j]=obj.nextInt();
}
}
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println("");
}
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
if(i==j)
{
sum=sum+a[i][j];
}
}
}
int sum1=0;
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
if((i+j)==(r-1))
{
sum1=sum1+a[i][j];
}
}
}
System.out.println("The sum is : "+sum);
System.out.println("The sum is : "+sum1);
}
}
