interface MinMax<T extends Comparable<T>>
{
T max();
T min();
}
class MyClass<T extends Comparable<T>>implements MinMax<T>
{
T val[];
MyClass(T o[])
{
val=o;
}
public T max()
{
T v=val[0];
for(int i=0;i<val.length;i++)
{
if(val[i].compareTo(v)>0)
{
v=val[i];
}
}
return v;
}
public T min()
{
T v=val[0];
for(int i=0;i<val.length;i++)
{
if(val[i].compareTo(v)<0)
{
v=val[i];
}
}
return v;
}
}
class Gen
{
public static void main(String ar[])
{
Integer inum[]={3,4,5,6};
Character ch[]={'a','b','c','m'};
MyClass<Integer> a=new MyClass<Integer>(inum);
MyClass<Character> b=new MyClass<Character>(ch);
System.out.println("Max = "+a.max());
System.out.println("Min = "+a.min());
System.out.println("Max = "+b.max());
System.out.println("Min = "+b.min());
}
}