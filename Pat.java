import java.util.Scanner;
class Pat
{
public static void main(String ar[])
{
int r,c;
Scanner obj=new Scanner(System.in);
r=obj.nextInt();
c=obj.nextInt();
int a[][]=new int[r][c];
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
System.out.println();
}
int res=r*c;
for(int l=0;l<=res/2;l++)
{
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
if((i+j)==l)
{
System.out.print(a[j][i]+" ");
}
}
}
System.out.println();
}
}
}