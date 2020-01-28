import java.util.Scanner;
abstract class A
{
int a[]=new int[10];
A(int a[])
{
for(int i=0;i<a.length;i++)
this.a[i]=a[i];
}
abstract int large();
}
class B extends A
{
B(int a[])
{
super(a);
}
int large()
{
int l=-100;
for(int i=0;i<a.length;i++)
{
if(l<a[i])
l=a[i];
}
return l;
}
}
class C extends A
{
C(int a[])
{
super(a);
}
int large()
{
int l=-100;
for(int i=0;i<a.length;i++)
{
if(l<a[i])
l=a[i];
}
return l;
}
}
class Abstract1
{
public static void main(String ar[])
{

int arr[]={1,2,3,4,5};
A a=new B(arr);
System.out.println(a.large());
int arr1[]={1,2,3,4,6};
A a1=new C(arr1);
System.out.println(a1.large());
}
}